import sys
input = sys.stdin.readline
n = int(input().strip())
line = []

for _ in range(n):
    x,y = map(int, input().split())
    if x > y :
        x, y = y,x
    line.append((x,y))
line.sort()

start, end = line[0]
cnt = 0

for s, e in line[1:]:
    if s <= end:
        if e > end:
            end = e
    else: 
        cnt += end - start
        start, end = s, e

cnt += end - start
print(cnt)