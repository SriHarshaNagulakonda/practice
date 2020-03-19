import urllib.request,urllib.parse,urllib.error
from bs4 import BeautifulSoup
url=' http://py4e-data.dr-chuck.net/comments_259372.html'
html=urllib.request.urlopen(url).read()
soup=BeautifulSoup(html,'html.parser')

tags=soup('span')
    
s=0
for tag in tags:
    s+=int(tag.contents[0])
print(s)

