import sys
input = sys.stdin.readline

n = int(input())
lst = [list(input().split()) for x in range(n)]

answer = sorted(lst, key=lambda x: int(x[0]))

for i in answer:
    print(i[0], i[1])