import sys
pair = {
    ")" : "(",
    "]" : "[",
    "}" : "{"
    }
closer = ")]}"
opener = "([{"

while 1:
    s = sys.stdin.readline().rstrip()
    if s == '.':
        break
    stack = []
    flag = True
    for i in s:
        if i in opener:
            stack.append(i)
        elif i in closer:
            if stack:
                if pair[i] == stack.pop():
                    continue
                else:
                    print("no")
                    flag = False
                    break
            else:
                print("no")
                flag = False
                break
    if not stack and flag:
        print("yes")
    elif stack and flag:
        print("no")