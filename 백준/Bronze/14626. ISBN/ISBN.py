import sys
input = sys.stdin.readline
isbn = input().strip()
total = 0
order = 0
for i, value in enumerate(isbn):
    weight = 1 if i % 2== 0 else 3
    if value == '*':
        order = weight
    else: 
        total += int(value) * weight
for d in range(10):
    if  (total + d *order ) % 10 == 0:
        print(d)
        break