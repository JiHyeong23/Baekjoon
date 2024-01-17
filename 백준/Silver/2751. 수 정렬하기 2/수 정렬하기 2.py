import sys
input = sys.stdin.readline
n = int(input())

lst = [int(input()) for x in range(n)]

#merge
def merge(list1, list2):
    re = []
    i = j = 0
    while i < len(list1) and j < len(list2):
        if list1[i] < list2[j]:
            re.append(list1[i])
            i += 1
        else:
            re.append(list2[j])
            j += 1
    while i < len(list1):
        re.append(list1[i])
        i += 1

    while j < len(list2):
        re.append(list2[j])
        j += 1

    return re

def merge_sort(lst):
    if len(lst) <= 1:
        return lst
    
    mid = len(lst) // 2

    left = lst[:mid]
    right = lst [mid:]

    s_l = merge_sort(left)
    s_r = merge_sort(right)
    
    return merge(s_l, s_r)

answer = merge_sort(lst)
for i in answer:
    print(i)