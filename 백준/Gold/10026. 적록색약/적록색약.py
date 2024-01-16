import sys
sys.setrecursionlimit(10**6)

n = int(input())
graph = [input() for _ in range(n)]
graph2 = graph.copy()

for i in range(n):
    graph2[i] = graph2[i].replace('G', 'R')

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

def dfs(x, y, grim, color):
    if not (0 <= x < n and 0 <= y < n) or grim[x][y] != color:
        return
    
    grim[x] = grim[x][:y] + 'O' + grim[x][y+1:]

    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        dfs(nx, ny, grim, color)

normal = 0
for i in range(n):
    for j in range(n):
        if graph[i][j] != 'O':
            normal += 1
            dfs(i, j, graph, graph[i][j])

rg = 0
for i in range(n):
    for j in range(n):
        if graph2[i][j] != 'O':
            rg += 1
            dfs(i, j, graph2, graph2[i][j])

print(normal, rg)