import xml.etree.ElementTree as ET

data='''
    <person>
    hello
      <name>Chuck
      <a>1</a>
      <b>2</b>
      </name>
      <phone type='intl'>
        +1 734 303 4456
      </phone>
      <email hide='yes'/>
    </person>'''

x=ET.fromstring(data)
print('Name: ',x.find('name/a').text)
print('Attr: ',x.find('phone').text)
