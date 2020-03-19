'''

12
16
1 3
1 4
1 5
2 6
2 8
3 9
4 7
5 7
5 9
5 11
6 10
7 10
8 10
8 11
9 11
11 12

'''

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
        for i in range(n):
            if a[x][i]==1:
                if visit[i]==0:
                    visit[i]=1
                    q.append(i)
                    parent[i]=x
                    path[i]=path[x]+[i]
                    level[i]=level[x]+1
                    cycle[(x,i)]=1
                    cycle[(i,x)]=1
    return (level,parent,path,cycle)
def bfs1(b):
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
        for i in b[x]:
            if visit[i]==0:
                    visit[i]=1
                    q.append(i)
                    parent[i]=x
                    path[i]=path[x]+[i]
                    level[i]=level[x]+1
    return (level,parent,path)

def get(i):
    global count
    visit[i]=1
    pre[i]=count
    count+=1
    print(i+1,end=' ')
    for j in range(n):
        if a[i][j]==1:
            if visit[j]==0:
                parent[j]=i
                get(j)
                post[i]=count
                count+=1

def dfs(a):
    print("DFS")
    get(source)
    print(parent)
    print(pre,post)

n=int(input('Enter no. of nodes'))
m=int(input('Enter no. of edges'))

a=[[0]*n for i in range(n)]
b=[[] for i in range(n)]
visit=[0]*n
parent=[-1]*n
pre=[0]*n
post=[0]*n
count=0
cycle={}
for i in range(m):
    x,y=map(int,input().split())
    cycle[(x-1,y-1)]=0
    cycle[(y-1,x-1)]=0
    a[x-1][y-1]=1
    a[y-1][x-1]=1
    b[x-1].append(y-1)
    b[y-1].append(x-1)
source=int(input('Enter Source'))-1
#destination=int(input('Enter Destination'))
print(b[0],len(b))
level,parent,path,cycle=bfs(a)
#level1,parent1,path1=bfs1(b)
print(level)#,level1)
#print(parent,parent1)
for i in range(n):
    print('pathpath[i])#,path1[i])

print(cycle)

#print(dfs(a))


