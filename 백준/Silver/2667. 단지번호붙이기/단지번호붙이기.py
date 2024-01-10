n = int(input())
graph = []
answer = []

for _ in range(n):
    graph.append(list(map(int, input())))

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

cnt=0
def dfs(x, y):
    global cnt
    if x < 0 or x >= n or y < 0 or y >= n:
        return
    
    if graph[x][y] == 1:
        cnt += 1
        graph[x][y] = 0
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            dfs(nx, ny)
            
for i in range(n):
    for j in range(n):
        if graph[i][j] == 1:
            dfs(i, j)
            answer.append(cnt)
            cnt = 0
            
answer.sort()

print(len(answer))
for x in answer:
    print(x)