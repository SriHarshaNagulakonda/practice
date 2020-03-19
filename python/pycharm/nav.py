import os
import sqlite3

paths = ['/home/harsha/Documents/Stepcone2020/']

files = []
for path in paths:
    for r, d, f in os.walk(path):
        for file in f:
            files.append(os.path.join(r, file))
print((files))
old = input('Enter old String')
new = input('Enter new String')
for file in files:
    if file[:-6:-1]!='lmth.':
        print(file)
        continue
    with open(file, 'r', encoding="utf8", errors='ignore') as ff:
        f = ff.read()
    ff.close()
    # f=open(file,'r').read()
    f1 = open(file, 'w')
    print(type(f), len(f), end=' ')
    # print(f.find("PDC</a></li>"),end=' ')
    print(f.find(old))
    X = f.replace(old, new)
    ff.close()
    f1.write(X)
    # print((len(f)))
