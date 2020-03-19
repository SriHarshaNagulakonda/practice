from collections import deque
def neigh(i,j):
    a=[(-2,-1),(-1,-2),(-2,1),(-1,2),(2,1),(1,2),(1,-2),(2,-1)]
    x=[]
    for p in a:
        if 7>=i+p[0]>=0 and 7>=j+p[1]>=0:
            x+=[(i+p[0],j+p[1])]
    return x
def find(a,b):
    visit=[[0]*8 for i in range(8)]
    count=[[0]*8 for i in range(8)]
    x1,y1=a[0],a[1]
    x2,y2=b[0],b[1]
    #route=[[[]]*8 for i in range(8)]
    route=[[[] for j in range(8)] for i in range(8)]
    count[x1][y1]=0
    q=deque([])
    visit[x1][y1]=1
    q.append((x1,y1))
    while len(q)!=0:
        i,j=q.popleft()
        for x in neigh(i,j):
            if visit[x[0]][x[1]]==0:
                q.append(x)
                count[x[0]][x[1]]=count[i][j]+1
                visit[x[0]][x[1]]=1
                route[x[0]][x[1]]=route[i][j]+[[i,j]]
            if x[0]==x2 and x[1]==y2:
                #return count[x[0]][x[1]],
                return route[x[0]][x[1]]+[[x[0],x[1]]]
    else:
        return False
s=i=tuple(map(int,input("Enter Source Index").split()))
d=j=tuple(map(int,input("Enter Destination Index").split()))
x=find(i,j)[1:]
print(len(x),"Steps")
print()
for i in x:
    print(i[0],',',i[1])
for i in range(8):
    print("-----"*8)
    for j in range(8):
        if s[0]==i and s[1]==j:
            print('| S |',end='')
        elif d[0] == i and d[1] == j:
            print('| D |', end='')
        elif [i,j] in x:
            print('|',x.index([i,j])+1,'|',end='')
        else:
            print('|   |',end='')
    print()
