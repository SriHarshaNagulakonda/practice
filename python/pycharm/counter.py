from collections import Counter

n,a=int(input()),[int(i) for i in input().split()]
t=(int(input()))
b=Counter(a).items()
for i in range(t):
    x,y=map(int,input().split())
print(b)