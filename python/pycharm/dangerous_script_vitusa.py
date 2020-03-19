def getchar(x):
    run=0
    c1=0
    c2=0
    sum=0
    while(x[i]!=0):
        c1=0
        c2=0
        if(x[i]=="/" and ((x[i+1])>="a" and x[i+1]<="z") or(x[i+1]>=49 and x[i+1]<=57)):
            for j in range(i,0,-1):
                run=0
                if(x[j]>="a" and x[j]<="z"):
                    c1+=1
                if(s[j]=="\\"):
                    break
            j=i
            while(run==0):
                if(x[j]=="\\"):
                    run=1
            run=0
            while(run==0):
                if(x[k]>="a" and x[k]<="z"):
                    c2+=1
                else:
                    run=1
                k+=1
            sum=sum+c1*c2
        i+=1
    return sum








l=[]
n=int(input())
for i in range(0,n):
    x=input()
    l.append(x)
for x in l:
    print(getchar(x))
