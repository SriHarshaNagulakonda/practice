class Student:
    def __init__(self,first,abc,last="abcd",age=1):
        self.first=first
        self.last=last
        self.age=age
        self.abc=abc

    def display(self):
        return self.first+" "+self.last
    def abcd(hello):
        return hello.first

#a=Student('vamsi')
b=Student('harsha','abcd',10)

#print(a.display())
print(b.display())
print(b.abcd())
