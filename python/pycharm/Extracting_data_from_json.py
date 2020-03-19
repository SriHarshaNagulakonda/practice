import urllib.request,urllib.parse,urllib.error
import json

fhand=urllib.request.urlopen('http://py4e-data.dr-chuck.net/comments_259375.json')
data=""
for i in fhand:
	#print(i.decode().strip())
    data+=i.decode().strip()

x=json.loads(data)

print(sum(map(lambda y: int(y['count']),x['comments'])))
