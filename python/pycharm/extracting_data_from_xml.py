import urllib.request,urllib.parse,urllib.error
import xml.etree.ElementTree as ET

fhand=urllib.request.urlopen(' http://py4e-data.dr-chuck.net/comments_259374.xml')
data=""
for i in fhand:
	#print(i.decode().strip())
    data+=i.decode().strip()

x=ET.fromstring(data)
l=x.findall('comments/comment')
print(sum(map(lambda x: int(x.find('count').text),l)))
