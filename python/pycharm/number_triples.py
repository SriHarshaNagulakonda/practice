'''
1 2 10
1 3 80
3 4 70
2 3 6
2 5 20
5 6 50
5 7 10
7 6 5
'''

def neigh(u):
    y=[]
    for i in range(n):
        if a[u][i]!=-1 and visit[i]==0:
            y+=[i]
    return y
def getIndex():
    m=sum+1
    for i in range(n):
        if visit[i]==0 and cost[i]<m:
            m=cost[i]
            j=i
    return j
def get():
    cost[source] = 0
    while visit.count(0)!=0:
        try:
            u=getIndex()
        except:
            return cost
        visit[u]=1
        for i in neigh(u):
            if a[u][i]+cost[u]<cost[i]:
                cost[i]=a[u][i]+cost[u]
    return cost
x,source,dest=map(int,input().split())
temp=[]
n=0
ma=0
n=0
sum=0
source=source-1
for i in range(x):
    s,w,d=map(int,input().split())
    temp+=[[s,w,d]]
    sum=sum+w
    if s>d and s>n:
        n=s
    elif d>s and d>n:
        n=d
visit = [0] * n
cost = [sum+1] * n
a = [[-1] * n for i in range(n)]
for i in temp:
    s,w,d=i
    a[s-1][d-1]=w
    a[d-1][s-1]=w
print(get()[dest-1])
