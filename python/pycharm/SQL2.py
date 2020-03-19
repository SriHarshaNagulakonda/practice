import sqlite3
import urllib.request,urllib.parse,urllib.error

conn = sqlite3.connect('emaildb.sqlite')
cur = conn.cursor()

cur.execute('DROP TABLE IF EXISTS Counts')

cur.execute('''
CREATE TABLE Counts (org TEXT, count INTEGER)''')

fname = input('Enter file name: ')
if (len(fname) < 1): fname = 'mbox.txt'
fhand=urllib.request.urlopen(' http://www.py4e.com/code3/mbox.txt')
for i in fhand:
    print(i.decode())