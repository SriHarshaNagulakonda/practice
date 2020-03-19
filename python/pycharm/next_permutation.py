import  math
def next(s):
    for i in range(len(s)-1,0,-1):
        if s[i]>s[i-1]:
            j=i-1
            break
    else:
        #print("Next Permutation doesn't Exist")
        quit()
    a=s[i-1]
    s=list(s)
    if s==None:
        return -1
    for i in range(len(s)-1,j,-1):
        if s[i]>s[j]:
            s[i],s[j]=s[j],s[i]
            break
    s=s[:j+1]+s[:j:-1]
    print("".join(s).lstrip("0"))
    return "".join(s).lstrip("0")
s=input("Enter a Word")
for i in range(math.factorial(len(s))):
    s=next(s)