import sys
input = sys.stdin.readline
mod = 1000000007
n = int(input().strip())
a = list(map(int, input().split()))
remain = sum(a)
result = 0
for i in range(n):
    remain -= a[i]
    result += a[i] * remain
print(result%mod)