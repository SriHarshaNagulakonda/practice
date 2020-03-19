from collections import deque
def bfs(a):
    visit=[0]*n
    level=[-1]*n
    parent=[-1]*n
    visit[source]=1
    parent[source]=-1
    level[source]=0
    path=[""]*n
    path[source]=[source]
    q=deque([source])
    while len(q)!=0:
        x=q.popleft()
        #if x==dest-1:
            #return level
        for i in range(n):
            if a[x][i]==1:
                if visit[i]==0:
                    visit[i]=1
                    q.append(i)
                    parent[i]=x
                    path[i]=path[x]+[i]
                    level[i]=level[x]+1
    return level


def bfs1(b):
    visit=[0]*n
    level=[-1]*n
    visit[source]=1
    level[source]=0
    q=deque([source])
    while len(q)!=0:
        x=q.popleft()
        for i in b[x]:
            if visit[i]==0:
                    visit[i]=1
                    q.append(i)
                    level[i]=level[x]+1
    return level

t=int(input())
for _ in range(t):
    n,q=map(int,input().split())
    x=[int(i) for i in input().split()]
    #print(x)
    a=[[0]*n for i in range(n)]
    for i in range(n):
        for j in range(i+1,n):
            if x[i]<x[j]:
                a[i][j]=1
                a[j][1]=1
    temp=[]
    dist=a
    for k in range(n):
        for i in range(n):
            for j in range(n):
                dist[i][j] = min(dist[i][j],dist[i][k]+dist[k][j])
    print(dist)
    for i in range(q):
        source,dest=map(int,input().split())
        print(dist[source-1][dest-1])
