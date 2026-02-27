import sys
input= sys.stdin.readline
n = int(input().strip())
k = int(input().strip())

def max_prime(x):
    if x == 1:
        return 1
    max_factor = 1
    d = 2
    while d*d <= x:
        if x%d == 0:
            max_factor = d
            while x % d == 0:
                x //= d
        d += 1
    if x > 1:
        max_factor = max(max_factor, x)
    return max_factor
count = 0
for i in range(1, n+1):
    if max_prime(i) <= k:
        count += 1

print(count)