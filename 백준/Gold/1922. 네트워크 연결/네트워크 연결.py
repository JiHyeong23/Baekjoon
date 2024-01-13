import heapq

n = int(input())
graph = [[] for _ in range(n+1)]

m = int(input())

for _ in range(m):
    i, ad, cost = map(int, input().split())
    graph[i].append((cost, ad))
    graph[ad].append((cost, i))

visited = [False] * (n+1)
visited[1] = True
heap = []
for cost, ad in graph[1]:
    heapq.heappush(heap, (cost, ad))

result = 0
used_edges = 0
while used_edges < n - 1:
    cost, i = heapq.heappop(heap)
    if visited[i]:
        continue
    visited[i] = True
    result += cost
    used_edges += 1

    for ad_cost, ad in graph[i]:
        if not visited[ad]:
            heapq.heappush(heap, (ad_cost, ad))
                
print(result)