import sys
from collections import deque
n = int(input())

que = deque()
for i in range(n):
    s = sys.stdin.readline().rstrip()
    que.append(s)

cnt = 0
for i in range(n):
    s = sys.stdin.readline().rstrip()
    if que[0] != s:
        cnt += 1
        que.remove(s)
    else:
        que.popleft()

print(cnt)