import sys
n = int(sys.stdin.readline())

for _ in range(n):
    left = []
    right = []
    
    pw = list(sys.stdin.readline().rstrip())
    for i in pw:
        if i == ">":
            if right:
                left.append(right.pop()) 
        elif i == "<":
            if left:
                right.append(left.pop())
        elif i == "-":
            if left:
                left.pop()
        else:
            left.append(i)

    print("".join(left) + "".join(reversed(right)))
