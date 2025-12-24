import sys
input = sys.stdin.readline
n,m = map(int,input().split())
basket = [0 for _ in range(n)]
for _ in range(m):
    s,e,num = map(int, input().split())
    for i in range(s-1, e):
        basket[i] = num

print(*basket)