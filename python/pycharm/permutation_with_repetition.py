def next(s,l,index,data):
    for i in range(l):
        if (l== index):
            print("".join(data))
            return
        data[index]=s[i]
        next(s,l,index+1,data)
a=list(input("Enter a word"))
a.sort()
print(a)
next(a,len(a),0,[""]*(len(a)))
