import sys
input = sys.stdin.readline

n = int(input())
lst = [int(input()) for x in range(n)]
lst.sort()

def avg(lst):
    return round(sum(lst)/len(lst))

def mid(lst):
    midnum = len(lst) // 2
    return lst[midnum]

def many(lst):
    lstset = {}
    for i in lst:
        if i in lstset:
            lstset[i] += 1
        else:
            lstset[i] = 1
    many = [x for x, y in lstset.items() if max(lstset.values()) == y]
    if len(many) == 1:
        return many[0]
    else:
        return many[1]
        
def area(lst):
    return max(lst) - min(lst)

print(avg(lst))
print(mid(lst))
print(many(lst))
print(area(lst))