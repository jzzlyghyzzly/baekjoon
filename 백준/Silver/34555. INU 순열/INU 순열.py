import sys
input = sys.stdin.readline
N= int(input().strip())

start = N//2 +1

arr = [start]
m = start
for i in range(1, N):
    if i % 2 == 1:
        m -= i
    else:
        m += i
    arr.append(m)
print(*arr)