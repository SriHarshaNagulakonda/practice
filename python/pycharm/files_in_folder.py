#<li><a href="../workshops/arvr.html">AR AND VR</a></li>
#<li><a href="workshops/arvr.html">AR AND VR</a></li><li><a href="workshops/humanoidrobo.html">HUMANOID ROBO</a></li>

import os
import sqlite3

path = '/home/harsha/Documents/DL/logistic regression/images/'

files = []
# r=root, d=directories, f = files
for r, d, f in os.walk(path):
    for file in f:
        files.append(os.path.join(r, file))

old = input('Enter old String')
new = input('Enter new String')
for file in files:
    if file[:-6:-1]!='lmth.':
        print(file)
        continue
    with open(file, 'r', encoding="utf8", errors='ignore') as ff:
        f = ff.read()

    #f=open(file,'r').read()
    f1=open(file,'w')
    print(type(f),len(f),end=' ')
    #print(f.find("PDC</a></li>"),end=' ')
    print(f.find(old),file)
    X=f.replace(old,new)
    f1.write(X)
    ff.close()
    #print((len(f)))
'''
d={}
for f in files:
    #print(f)
    s=f.split('/')[-2]
    j=f.split('/')[-1].split('.')[0]
    #print(s,j)
    j=j.strip()
    if len(j) == 3:
        j = "17341A0" + j
    if j in d:
        d[j]+=[s]
    else:
        d[j]=[s]

''
#print(d)
conn=sqlite3.connect('cert.sqlite')
cur=conn.cursor()

cur.execute('drop table if exists Certificates')
cur.execute('create table Certificates(jntu varchar(10),Course1 int,course2 int,course3 int,course4 int,course5 int)')

for i in sorted(d.keys()):
    c=["No"]*5
    for j in d[i]:
        c[int(j)-1]="Yes"
    cur.execute('insert into Certificates values(?,?,?,?,?,?)',(i,c[0],c[1],c[2],c[3],c[4],))

conn.commit()
'''
