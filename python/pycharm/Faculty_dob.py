import urllib.request,urllib.parse,urllib.error
from bs4 import BeautifulSoup
url='http://www.gmrit.org/faculty_members.html'
html=urllib.request.urlopen(url).read()
soup=BeautifulSoup(html,'html.parser')

tags=soup('a')

for tag in tags[8:]:
    try:
        if(len(tag.contents)>0):
            if tag.get('href').split('/')[1]=="cse":
                print(tag.get('href'))
                url1 = 'http://www.gmrit.org/'+tag.get('href')
                print(url1)
                html1 = urllib.request.urlopen(url1).read()
                soup1 = BeautifulSoup(html1, 'html.parser')
                tags1=soup1('font',size="2")
                print(tags1[0].contents[0],tags1[1].contents[0].strip())
                tags1=soup1('span',style="FONT-FAMILY: Arial; FONT-SIZE: 10pt; mso-bidi-font-size: 12.0pt")
                print(tags1[0].contents[0],tags1[2].contents)
                tags1 = soup1('font', size="2",face="Arial")
                print(tags1[2].contents[0], tags1[3].contents)
                #for x in tags1:
                #    print(x.contents)
#                for x in tags1:
#                    if x.get("size")=="2":
#                        print(x.contents)
                #print(tags1)
                #break
    except:
        continue
