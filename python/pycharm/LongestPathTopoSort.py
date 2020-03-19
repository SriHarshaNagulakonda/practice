'''
8
11
1 3
1 4
1 5
2 3
2 8
3 6
4 6
4 8
5 8
6 7
7 8
'''
from collections import deque


def get():
    y = []
    for i in range(1, n + 1):
        if indegree[i] == 0:
            y += [i]
    return y


def getLongestPath(a):
    path = [0] * (n + 1)
    q = deque(get())
    while(len(q)!=0):
        i=q.popleft()
        for j in a[i]:
            path[j] = max(path[j], path[i] + 1)
            indegree[j] -= 1
            if indegree[j]==0:
                q.append(j)
        indegree[i] = -1
    return path


n = int(input('Enter no. or Nodes'))
v = int(input('Enter no. of Vertices'))
a = [[] for i in range(n + 1)]
indegree = [0] * (n + 1)
for i in range(v):
    x, y = map(int, input().split())
    a[x].append(y)
    indegree[y] += 1
print(indegree)
print(getLongestPath(a))
print(indegree)