n = int(input())
tops = list(map(int, input().split()))
answer = [0] * n

stack = []
for i, top in enumerate(tops):
    if stack:
        while 1:
            if top <= stack[-1][0]:
                answer[i] = stack[-1][1]+1
                stack.append([top, i])
                break
            else:
                stack.pop()
            if not stack:
                stack.append([top, i])
                break
    else:
        stack.append([top, i])
print(' '.join(map(str, answer)))