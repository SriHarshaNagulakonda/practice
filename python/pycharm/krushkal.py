n,m=map(int,input().split())
a=[[0]*n for i in range(n)]
a=[]
for i in range(m):
    u,v,w=map(int,input().split())
    a.append([w,u,v])
    #a[u-1][v-1]=w
    #a[v-1][u-1]=w
#print(a)
a.sort()
#print(a)
comp=[i for i in range(n)]
tree_edge=[]
while len(tree_edge)<n-1:
    #print(a)
    w,u,v=a.pop(0)
    if comp[u-1]!=comp[v-1]:
        #print(w)
        tree_edge.append(w)
        for i in range(n):
            if comp[i]==comp[v-1]:
                comp[i]=comp[u-1]

#print()
print(sum(tree_edge))
