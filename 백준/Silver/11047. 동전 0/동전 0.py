import sys
input = sys.stdin.readline
n, k = map(int, input().split())
a = [int(input().strip()) for _ in range(n)]
a = sorted(a, reverse=True)
cnt = 0
for i in range(n): 
    if k >= a[i]:
        cnt += k // a[i]
        k %= a[i]
        if k == 0:
            break
print(cnt)