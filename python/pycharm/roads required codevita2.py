'''

President Chew Barka rules over puppy Land. Elections are near, and he has not done much. The President wants to be reelected again.

He knows some states where he most definitely will lose. He needs to do something for these people. A state is a group of cities, which is connected with any other city. Now, commutation is a serious problem for citizens, and there is only one road for transportation between any two cities in a state. He knows if he connects all cities with each other in a state by roads, the citizens of state will be very happy and vote him again.

He sends Sherlock Bones to figure out how many roads they have to build in every state for gaining the trust of the people. Help Sherlock Bones to find out the count of required roads.

7 5
1 2
1 3
2 4
5 6
5 7

output

4


14 13
1 2
1 3
2 3
4 5
6 7
6 8
7 8
8 9
9 10
8 10
11 12
12 13
13 14

7


5 10
1 2
1 3
1 4
1 5
2 3
2 4
2 5
3 4
3 5
4 5

0


'''

n,m=map(int,input().split())
a=[[] for i in range(n+1)]
for i in range(m):
    u,v=map(int,input().split())
    a[u].append(v)
#print(a)
edges={}
vertices={}
comp=[i for i in range(n+1)]
for i in range(n+1):
    for j in a[i]:
        comp[j]=comp[i]
        xxx=comp[i]
        if comp[i] in edges:
            edges[xxx]+=1
        else:
            edges[xxx]=1

for i in range(1,n+1):
    xxx=comp[i]
    if xxx in vertices:
        vertices[xxx]+=1
    else:
        vertices[xxx]=1

#print(comp,edges,vertices)
#for i in d:
sss=0
for i in edges:
    comp_n=vertices[i]
    count=comp_n*(comp_n-1)//2
    sss+=count-edges[i]
print(sss)
