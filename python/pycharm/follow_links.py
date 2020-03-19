import urllib.request,urllib.parse,urllib.error
from bs4 import BeautifulSoup


url='http://py4e-data.dr-chuck.net/known_by_Adrianna.html'

for i in range(7):
    html=urllib.request.urlopen(url).read()
    soup=BeautifulSoup(html,'html.parser')
    tags=soup('a')
    s=0
    url=tags[17].get('href',None)
    print(url)
    print(tags[17].contents[0])
print(url.split('_')[-1].split('.')[0])
