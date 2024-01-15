N = int(input())
switch = [-1] + list(map(int, input().split()))
student = int(input())


def man(x):
    cur = x
    while cur < len(switch):
        if switch[cur] == 0:
            switch[cur] = 1
        elif switch[cur] == 1:
            switch[cur] = 0
        cur += x

def woman(x):
    if switch[x] == 0:
        switch[x] = 1
    elif switch[x] == 1:
        switch[x] = 0

    count = 1
    while x - count > 0 and x + count < len(switch):
        if switch[x-count] == switch[x+count]:
            if switch[x+count] == 1:
                switch[x+count] = 0
                switch[x-count] = 0
            elif switch[x+count] == 0:
                switch[x+count] = 1
                switch[x-count] = 1
            count += 1
        else:
            break

for _ in range(student):
    gender, num = map(int, input().split())
    if gender == 1:
        man(num)
    if gender == 2:
        woman(num)

for i in range(1, N+1):
    print(switch[i], end=" ")
    if i % 20 == 0:
        print()