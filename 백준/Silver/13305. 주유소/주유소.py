import sys
from collections import deque
input = sys.stdin.readline

n = int(input()) #도시의 갯수
load = list(map(int, input().split())) #도시 간 거리
cost = deque(map(int, input().split())) #도시 별 리터당 주유비
cost.pop()

total = 0
if cost[0] == min(cost):
    print(cost[0] * sum(load))
    
else:
    total += cost.popleft() * load[0] #일단사

    for i in range(1, len(cost)):
        min_cost = min(cost)
        city = cost.popleft()
        if city == min_cost:
            total += city * sum(load[i:])
        else:
            total += city * load[i]

    print(total)