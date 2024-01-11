import sys    
sys.setrecursionlimit(10000)
n = int(input())

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

def dfs(x, y, a, b):
    global cnt
    if graph[x][y] == 1:
        graph[x][y] = 0
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < b and 0 <= ny < a and graph[nx][ny] == 1:
                dfs(nx, ny, a, b)

for _ in range(n):
    a, b, c = list(map(int, input().split()))
    graph = [[0]*a for x in range(b)]
    
    for i in range(c):
        x, y = map(int, input().split())
        graph[y][x] = 1

    cnt = 0
    for i in range(b):
        for j in range(a):
            if graph[i][j] == 1:
                cnt += 1
                dfs(i, j, a, b)

    print(cnt)