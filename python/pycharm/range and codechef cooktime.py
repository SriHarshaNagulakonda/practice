from math import  log
t=int(input())
for _ in range(t):
    l,r=map(int,input().split())
    print(l+(2**(int(log(l,2))+1)-(l+1))*(2**(int(log(l,2)))))