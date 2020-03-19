import time
def path(x,y):
    if(y[0]==x[0] or y[1]==x[1]):
        return 1
    return path(x,(y[0]-1,y[1]))+path(x,(y[0],y[1]-1))
x1,y1=map(int,input('Enter Source Index').split())
x2,y2=map(int,input('Enter Destination Index').split())
x=time.time()
print(path((x1,y1),(x2,y2)))
y=time.time()
print(y-x)