import xml.etree.ElementTree as ET

input='''
<stuff>
<users>
<user x='2'>
<id>001</id>
<name>Chuck</name>
</user>
<user x='7'>
<id>009</id>
<name>Brent</name>
</user>
</users>
</stuff>
'''

stuff=ET.fromstring(input)
lst=stuff.findall('users/user')
for i in lst:
    print(i.find('name').text)
    print(i.find('id').text)