import sys
import heapq
input = sys.stdin.readline

n = int(input())
for _ in range(n):
    m = int(input())
    pages = list(map(int, input().split()))
    heapq.heapify(pages)
    ans = 0
    for i in range(m-1):
        a = heapq.heappop(pages)
        b = heapq.heappop(pages)
        ans += a+b
        heapq.heappush(pages, a+b)
    print(ans)