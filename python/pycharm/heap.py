def insert(l,x,y):
    if y==0:
        l+=[x]
    i=l.index(x)
    if i==0:
        return l
    j = (i - 2) // 2
    if i%2==1:
        j=(i-2)//2+1
    if l[i]>l[j]:
        l[i],l[j]=l[j],l[i]
        return insert(l,x,1)
    return l
def delmax(l):
    if len(l)==0 or len(l)==1:
        return []
    l[0]=l.pop()
    #print(l)
    for i in range(len(l)//2):
        if l[2*i+1]>l[2*i+2] and l[2*i+1]>l[i]:
            l[i],l[2*i+1]=l[2*i+1],l[i]
            #print(l)
        elif l[2*i+2]>l[i]:
            l[i],l[2*i+2],l[2*i+2],l[i]
            #print(l)
    return l
l=[]
'''for i in range(10):
    l=insert(l,i,0)
    print(l)'''
#print(insert([98,67,89,38,42,54,89,17,25],97,0));
l=delmax([100,97,93,38,67,54,93,17,25,42])
print(l)
print(delmax(l))