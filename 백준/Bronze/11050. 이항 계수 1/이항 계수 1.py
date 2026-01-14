import sys
input = sys.stdin.readline
n,k = map(int, input().split())
up = 1
mid = 1
down = 1
for i in range(1,n+1):
    up *= i
for i in range(1, n-k+1):
    mid *= i
for i in range(1, k+1):
    down *= i
print(up // (mid*down))