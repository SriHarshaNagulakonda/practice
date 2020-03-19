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
    m=x
    for i in range(n):
        if visit[i]==0 and cost[i]<m:
            m=cost[i]
            j=i
    return j
def get():
    cost[source] = 0
    while visit.count(0)!=0:
        try:
            u = getIndex()
        except:
            return cost
        visit[u]=1
        for i in neigh(u):
            if a[u][i]+cost[u]<cost[i]:
                cost[i]=a[u][i]+cost[u]
    return cost
n=int(input('Enter no. of nodes'))
v=int(input('Enter no. of edges'))
visit=[0]*n
a=[[-1]*n for i in range(n)]
x=0
for i in range(v):
    s,d,w=map(int,input().split())
    x+=w
    a[s-1][d-1]=w
    a[d-1][s-1]=w
cost=[x+1]*n
for i in a:
    for j in i:
        print(j,end=' ')
    print()
source=int(input('Enter Source'))-1
print(get())
