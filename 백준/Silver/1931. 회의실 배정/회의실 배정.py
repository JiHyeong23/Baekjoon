import sys
input = sys.stdin.readline

n = int(input())
meet = [list(map(int, input().split())) for _ in range(n)]
meet.sort(key=lambda x:(x[1], x[0]))
ans = 0
now = 0
for start, end in meet:
    if start >= now:
        ans += 1
        now = end
print(ans)