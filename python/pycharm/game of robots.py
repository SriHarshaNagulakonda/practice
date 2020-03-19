'''

2.....2.......3......2.....1

'''
t=int(input())
for _ in range(t):
    s=input()
    temp=0
    flag=0
    for i in range(len(s)):
        if s[i]!='.':
            temp=i+int(s[i])
            temp=min(temp,len(s)-1)
            flag=i
            break
    #print(flag)
    for i in range(flag+1,len(s)):
        if s[i]!='.':
            temp1=max(0,i-int(s[i]))
            #print(s[i],temp1,temp)
            if temp>=temp1:
                print('unsafe')
                break
            else:
                temp=min(int(s[i])+i,len(s)-1)
    else:
        print('safe')
