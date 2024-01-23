import sys
input = sys.stdin.readline

n, m = map(int, input().split())
book = list(map(int, input().split()))
book.sort()

plus = []
minus = []
for i in book:
    if i >= 0:
        plus.append(i)
    else:
        minus.append(i)

plus.sort(reverse=True)
minus.sort()
add = []
for i in range(len(plus)//m):
    add.append(plus[i*m])
if len(plus)%m > 0:
    add.append(plus[(len(plus)//m)*m])

for i in range(len(minus)//m):
    add.append(abs(minus[i*m]))
if len(minus)%m > 0:
    add.append(abs(minus[(len(minus)//m)*m]))
add.sort()

ans = 0
ans += add.pop()
ans += sum(add)*2

print(ans)