import sys
from collections import deque
input = sys.stdin.readline

n = int(input()) #도시의 갯수
load = list(map(int, input().split())) #도시 간 거리
cost = deque(map(int, input().split())) #도시 별 리터당 주유비
cost.pop()
total = 0
i = 0
while cost:
    min_cost = min(cost) #남은 도시중 가장 싼 가격
    city = cost.popleft() #도착한 도시의 주유
    
    if city == min_cost: #제일 낮은 가격이면
        total += city * sum(load[i:]) #남은만큼 다 주유
        break
    
    elif city < cost[0]: #뒷 도시보다 싸면
        total += city * load[i]
        while cost and city < cost[0]: #계속 비교
            i += 1
            total += city * load[i] #다음 도시까지 주유
            cost.popleft()
    else:
        total += city * load[i]

    i += 1

print(total)