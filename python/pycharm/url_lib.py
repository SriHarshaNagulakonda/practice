import urllib.request,urllib.parse,urllib.error

f=urllib.request.urlopen("http://nsriharsha.ml")

d={}

for i in f:
    print(i.decode())
    for j in i.decode().split():
        d[j]=d.get(j,0)+1

print(d)

