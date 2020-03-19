t=int(input())
for _ in range(t):
    a=input()
    m=int(a[1:])
    for i in range(1,len(a)):
        s=int(a[:i]+a[i+1:])
        #print(s)
        if s<m:
            m=s
    print(m)
