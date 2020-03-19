import sqlite3

conn=sqlite3.connect('emaildb.sqlite')
cur=conn.cursor()

cur.execute('drop table if exists Counts')
cur.execute('create table Counts (email varchar(100) primary key,count int)')

f=open('mbox.txt')
for i in f:
    if i.startswith('From: '):
        email=i.split()[1]
        #print(i.split()[1])
        try:
            cur.execute('insert into Counts values(?,1)',(email,))
        except:
            cur.execute('update Counts set count=count+1 where email=?',(email,))

for i in cur.execute('select * from Counts order by count desc'):
    print(i[0],i[1])

conn.commit()
