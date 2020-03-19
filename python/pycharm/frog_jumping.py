'''
Graph g(10);
	g.addEdge(0,1);
	g.addEdge(1,4);
	g.addEdge(0,2);
	g.addEdge(2,3);
	g.addEdge(3,4);
	g.addEdge(4,5);
	g.addEdge(5,6);
  g.addEdge(6,7);
  g.addEdge(7,9);
  g.addEdge(4,8);
  g.addEdge(8,9);
'''



from collections import deque


def neigh(x):
    p,q=x[0],x[1]
    r,d=a[x[0]][x[1]]
    y=[]
    i=p+1
    while i<=p+d and i<n:
        y.append([i,q])
        i+=1
    i=q+1
    while i<=q+r and i<m:
        y.append([p,i])
        i+=1
    return y

def route():
    que=deque([[0,0]])
    visit=[[0]*m for i in range(n)]
    while len(que)!=0:
        x=que.popleft()
        #print(x,count[x[0]][x[1]])
        if x[0]==n-1 and x[1]==m-1:
            return count
        y=neigh(x)
        #print(y)
        for i in y:
            p,q=i[0],i[1]
            if visit[p][q]==0:
                visit[p][q]=1
                que.append([p,q])
                count[p][q]+=count[x[0]][x[1]]+1
                path[p][q]=path[x[0]][x[1]]+[p,q]
    return count
n,m=map(int,input().split())
path=[[0]*m for i in range(n)]
count=[[0]*m for i in range(n)]
a=[[[0,0] for i in range(m)] for i in range(n)]
for i in range(n):
    x=list(map(int,input().split()))
    for j in range(m):
        a[i][j][0]=x[j]
for i in range(n):
    x=list(map(int,input().split()))
    for j in range(m):
        a[i][j][1]=x[j]
route()
print(count[n-1][m-1])
print(path[n-1][m-1])