import sys
input = sys.stdin.readline

n = int(input()) 
road = list(map(int, input().split())) 
cost = list(map(int, input().split())) 

total = 0
min_cost = 1000000001
for i in range(n-1):
    if cost[i] < min_cost:
        min_cost = cost[i]
    total += road[i] * min_cost

print(total)