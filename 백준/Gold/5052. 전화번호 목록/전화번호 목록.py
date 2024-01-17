import sys
input = sys.stdin.readline

n = int(input())
for _ in range(n):
    m = int(input())
    lst = []
    for _ in range(m):
        lst.append(input().strip())

    lst.sort()
    flag = True
    for i in range(len(lst)-1):
        if lst[i] == lst[i+1][:len(lst[i])]:
            print("NO")
            flag = False
            break
    if flag:
        print("YES")