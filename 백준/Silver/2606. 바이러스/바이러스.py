n = int(input())
m = int(input())

graph = [[0 for _ in range(n+1)] for _ in range(n+1)]

for _ in range(m):
    a,b = map(int, input().split())
    graph[a][b] = graph[b][a] = 1
    
visited = [False] * (n+1)

cnt = 0
def dfs(v):
    global cnt
    visited[v] = True
    
    for i in range(1, n+1):
        if graph[v][i] == 1 and not visited[i]:
            dfs(i)
dfs(1)
print(sum(visited) -1)