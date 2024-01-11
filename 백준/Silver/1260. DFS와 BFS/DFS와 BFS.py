from collections import deque

n, m, v = list(map(int, input().split()))

matrix = [[0]*(n+1) for i in range(n+1)]

visited_dfs = [0]*(n+1)
visited_bfs = [0]*(n+1)

for i in range(m):
  a, b = map(int,input().split())
  matrix[a][b] = matrix[b][a] = 1

def dfs(v):
  visited_dfs[v] = 1
  print(v, end = ' ')

  for i in range(1, n+1):
    if(visited_dfs[i] == 0 and matrix[v][i] == 1):
      dfs(i)

def bfs(v):
  queue = deque([v])
  visited_bfs[v] = 1
  
  while queue:
    v = queue.popleft()
    print(v, end = ' ')
    for i in range(1, n+1):
      if(visited_bfs[i] == 0 and matrix[v][i] == 1):
        queue.append(i)
        visited_bfs[i]=1

dfs(v)
print()
bfs(v)