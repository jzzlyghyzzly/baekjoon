import sys
input = sys.stdin.readline

s = input().strip()
k = input().strip()

compare = []
for c in s:
    if c.isalpha():
        compare.append(c)

text = ''.join(compare)

print(1 if k in text else 0)