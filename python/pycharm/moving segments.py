'''
2
4
5 7 2
4 6 1
1 5 2
6 8 1
4
1 2 1
1 2 1
1 2 1
1 2 1
'''

t=int(input())
for _ in range(t):
    n=int(input())
    flag=0
    x={}
    for j in range(n):
        a,b,s=map(int,input().split())
        #x={}
        for i in range(a,b+1,s):
            if i in x:
                #print('NO')
                flag=1
            else:
                x[i]=0
        #print(x)
        #if flag==1:
            #break
    print(x)
    if flag==0:
        print('YES')
    else:
        print('NO')
