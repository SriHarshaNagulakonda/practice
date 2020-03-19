'''
class Calculator:
    def __init__(self,num1,num2):
        self.num1=num1
        self.num2=num2

    def add(self):
        #print(num1+num2)
        return self.num1+self.num2

x=Calculator(1,2)
print(x.add())
'''


class Solution:
    def solve(self, num1, num2):
        # write your method here
        print(num1+num2)
a=int(input())
b=int(input())
c=Solution()
c.solve(a,b)


a,b=input().split()
a,b=int(a),int(b)


