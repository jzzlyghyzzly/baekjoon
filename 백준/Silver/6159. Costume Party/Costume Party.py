import sys
input = sys.stdin.readline

n, s = map(int, input().split())
cow = []

for _ in range(n):
    cow.append(int(input().strip()))

cow.sort()

left = 0
right = n - 1
cnt = 0

while left < right:
    if cow[left] + cow[right] <= s:
        cnt += (right - left)
        left += 1
    else:
        right -= 1

print(cnt)