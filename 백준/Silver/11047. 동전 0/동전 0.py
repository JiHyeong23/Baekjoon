import sys
input = sys.stdin.readline

n, m = map(int, input().split())
coin = [int(input()) for _ in range(n)]
ans = 0
for i in range(len(coin)-1, -1, -1):
    ans += m // coin[i]
    m %= coin[i]
print(ans)