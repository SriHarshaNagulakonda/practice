'''
5
l 353 r 865219
40801
43681
l 8753 r 889321
62513713
62750929
l 2306 r 553088
3666178
3730948
l 5836 r 863128
9651916
10133296
l 8079 r 38467
466831
911247
'''



from math import  log
from random import  randint
t=int(input())
for _ in range(t):
    l,r=randint(1,1000),randint(1000,10**4)
    print('l',l,'r',r)
    print(l+(2**(int(log(l,2))+1)-(l+1))*(l&(l+1)))
    s=l
    x=l
    print(x,end=' ')
    for i in range(l,r+1):
        x=x&(i+1)
        print(x,end=' ')
        if x==0:
            break
        s+=x
    print()
    print(s)