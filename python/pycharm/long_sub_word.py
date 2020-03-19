def common_word(p,q):
    m=0
    a = [[0] * (len(p) + 1) for i in range(len(q) + 1)]
    for j in range(len(q) - 1, -1, -1):
        for i in range(len(p) - 1, -1, -1):
            if p[j] == q[i]:
                a[i][j] = 1 + a[i + 1][j + 1]
                if m<a[i][j]:
                    m=a[i][j]
                    k=j
    return a
p=input('Enter first word')
q=input('Enter second word')
for i in a:
    for j in i:
        print(j,end=' ')
    print()
print(common_word(p,q))