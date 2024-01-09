n,m = map(int, input().split())
cards = list(map(int, input().split()))

for i in range(m):
    num1 = min(cards)
    cards.remove(num1)
    num2 = min(cards)
    cards.remove(num2)
    add = num1 + num2
    cards.append(add)
    cards.append(add)

print(sum(cards))
