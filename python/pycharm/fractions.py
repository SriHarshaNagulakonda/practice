import sys
import xml.etree.ElementTree as etree

def get_attr_number(a):
    s=0
    for i in a:
        print(i)
    return s

sys.stdin.readline()
xml = sys.stdin.read()
tree = etree.ElementTree(etree.fromstring(xml))
root = tree.getroot()
print(get_attr_number(root))