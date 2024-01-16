from collections import deque
n = int(input())

dx = [-1, 1, 2, 2, 1, -1, -2, -2]
dy = [2, 2, 1, -1, -2, -2, -1, 1]

def bfs(start, target):
    q = deque()
    q.append(start)

    while q:
        x, y = q.popleft()
        if x == target[0] and y == target[1]:
            return graph[x][y]-1
        for i in range(8):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < m and 0 <= ny < m and graph[nx][ny] == 0:
                graph[nx][ny] = graph[x][y] + 1
                q.append((nx, ny))

for _ in range(n):
    m = int(input())
    graph = [[0]*m for x in range(m)]
    start = list(map(int, input().split()))
    target = list(map(int, input().split()))
    graph[start[0]][start[1]] = 1
    print(bfs(start, target))
