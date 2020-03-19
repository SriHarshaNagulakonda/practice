n=int(input())
s=[]
for _ in range(n):
    s.append(list(input()))
s.sort()
print(s)
visit=[0]*n
x=[['']*4 for i in range(4)]
for i in range(n-1):
    if s[i][0]==s[i+1][0]:
        for j in range(4):
            x[0][j]=s[i][j]
        visit[i]=1
        for j in range(4):
            x[j][0]=s[i+1][j]
        visit[i+1]=1
        for j in range(n):
            if visit[j]==0:
                for k in range(1,4):
                    if s[j][0]==x[0][k]:
                        x[1][k]=s[j][1]
                        x[2][k] = s[j][2]
                        x[3][k] = s[j][3]
                        visit[j]==1
                        break

                for k in range(1,4):
                    if s[0][j]==x[k][0]:
                        x[k][1]=s[1][j]
                        x[k][2] = s[2][j]
                        x[k][3] = s[3][j]
        print(x)
        break