import time
def path(s,d):
    x,y=d[0]-s[0],d[1]-s[1]
    a=[[0]*(y+1) for i in range(x+1)]
    a[0]=[1]*(y+1)
    for i in range(x+1):
        a[i][0]=1
    for j in range(1,y+1):
        for i in range(1,x+1):
            if [j,i] in h:
                a[i][j]=0
            else:
                a[i][j]=a[i-1][j]+a[i][j-1]
    return a
x1,y1=map(int,input('Enter Source Index').split())
x2,y2=map(int,input('Enter Destination Index').split())
x=time.time()
n=int(input('Enter no of holes'))
h=[]
for i in range(n):
    h.append(list(map(int,input().split())))
a=path((x1,y1),(x2,y2))
for i in a[::-1]:
    for j in i:
        #print(str(j).zfill(4),end=' ')
        print("%4d" % j,end=' ')
    print()
print(time.time()-x)