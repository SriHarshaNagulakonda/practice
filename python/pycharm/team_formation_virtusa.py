'''

8
18
5
15
18
11
15
9
7
5
3
[18,5,15,18,11,15,9,7],5,3)




def maximum():
    m=-10**10
    i = n - 1
    while i >= r:
        #print(i,m)
        if a[i][1]==0 and a[i][0] > m:
            m = a[i][0]
            j = i
        i -= 1
    i = l - 1
    while i >= 0:
        #print(i,m)
        if a[i][1]==0 and a[i][0] > m:
            m = a[i][0]
            j = i
        i -= 1
    a[j][1] = 1
    return (m,j)
n=int(input())
a=[]
x=0
for i in range(n):
    y=int(input())
    a.append([y,0])
    x+=y
t=int(input())
k=int(input())
if(t>n):
    print(x)
l=min(k,n-1)
r=max(n-k,0)
j=n-1
m=a[-1][0]
#print(a,type(a[i][0]),type(m))
m,j=maximum()
print(m,l,r,j)
a[j][1]=1
s=[m]
count=1
while count!=t:
    if j<l:
        l+=1
        l=min(n-1,l)
        if m<=a[l][0]:
            m,j=a[l][0],l
            a[l][1]=1
        else:
            m,j=maximum()
    else:
        r-=1
        r=max(r,0)
        if m<=a[r][0]:
            m,j=a[r][0],r
            a[r][1]=1
        else:
            m,j=maximum()
    s=s+[m]
    count+=1
print(s)
print(sum(s),a,count)
'''


def teamFormation(b, t, k):
    def maximum():
        m=-10**10
        i = n - 1
        while i >= r:
            #print(i)
            #print(i,m)
            if a[i][1]==0 and a[i][0] > m:
                m = a[i][0]
                j = i
            i -= 1
        i = l - 1
        while i >= 0:
            #print(i)
            if a[i][1]==0 and a[i][0] > m:
                m = a[i][0]
                j = i
            i -= 1
        a[j][1] = 1
        return (m,j)

    n=len(b)
    a=[]
    x=0
    for i in range(n):
        y=b[i]
        a.append([y,0])
        x+=y
    if(t>=n):
        return x

    l=min(k,n-1)
    r=max(n-k,0)
    j=n-1
    m=a[-1][0]
    #print(a,type(a[i][0]),type(m))
    m,j=maximum()
    #print(m,l,r,j)
    a[j][1]=1
    s=m
    count=1
    while count!=t:
        if j<l:
            l+=1
            l=min(n-1,l)
            if m<=a[l][0]:
                m,j=a[l][0],l
                a[l][1]=1
            else:
                m,j=maximum()
        else:
            r-=1
            r=max(r,0)
            if m<=a[r][0]:
                m,j=a[r][0],r
                a[r][1]=1
            else:
                m,j=maximum()
        print(m,end=' ')
        s=s+m
        count+=1
    print('numbers')
    print(a,s)
    return s
print("answer :",teamFormation([17,12,10,2,7,2,11,20,8],6,4))
