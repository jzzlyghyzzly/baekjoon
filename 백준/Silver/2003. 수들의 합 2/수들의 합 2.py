import sys 
input = sys.stdin.readline
n, m = map(int, input().split())
a = list(map(int, input().split()))

start = 0
end = 0
sum = 0
cnt = 0
while True:
    if sum >= m:
        if sum == m:
            cnt += 1
        sum -= a[start]
        start += 1
    elif end == n:
        break
    else:
        sum += a[end]
        end += 1
print(cnt)