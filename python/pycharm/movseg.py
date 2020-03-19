t=int(input())
for _ in range(t):
    n=int(input())
    x=[0]*n
    for i in range(n):
        a,b,s=map(int,input().split())
        x[i]=list(range(a,b+1,s))
    y={}
    for 