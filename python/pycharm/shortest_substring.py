s="aabbcdddd"
s=s.lstrip(s[0])
s=s.rstrip(s[-1])
print(s)
l=len(set(s))
min=len(s)
for i in range(len(s)):
    for j in range(i+1,len(s)):
        if len(set(s[i:j]))==l:
            print(s[i:j])

