import sys
input =sys.stdin.readline
n, i = map(int, input().split())
handle =[]
for _ in range(n):
    handle.append((input().split()))
handle.sort()
print(*handle[i-1])