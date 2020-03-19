x=open('nav.py','r').read()
x=x.lower()
a={}
for i in x:
    if i.isalpha():
        a[i]=a.get(i,0)+1
a=list(a.items())
for i in sorted(a,key=lambda x: x[1],reverse=True):
    print(i[0],i[1])