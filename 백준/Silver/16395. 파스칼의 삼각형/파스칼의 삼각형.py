import sys
input = sys.stdin.readline
n , k = map(int, input().split())
up  = 1
down = 1
for i in range(n-k+1, n):
    up *= i
for j in range(1,k):
    down *= j
print(up //down)