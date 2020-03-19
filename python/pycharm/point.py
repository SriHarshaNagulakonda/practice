from math import sqrt
class point:
    def __init__(self,x,y):
        self.x=x
        self.y=y
    def display(self):
        print(self.x,self.y)
    def __add__(self, other):
        return (self.x+other.x,self.y+other.y)
    def dist(self,other):
        return sqrt((other.x-self.x)**2+(other.y-self.y)**2)
a=point(2,3)
b=point(6,3)
print(a+b)
print(a)
print(a.dist(b))