import urllib.request,urllib.parse,urllib.error
from bs4  import BeautifulSoup

html=urllib.request.urlopen("http://nsriharsha.ml").read()
soup=BeautifulSoup(html,"html.parser")

tag=soup('a')

print(type(tag))
for i in tag:
    print(i.contents[0])

