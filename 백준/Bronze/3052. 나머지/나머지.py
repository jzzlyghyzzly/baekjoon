import sys
input = sys.stdin.readline
cnt = [0]*42
for _ in range(10):
    number = int(input().strip())
    cnt[number % 42] += 1
count = 0
for i in range(len(cnt)):
    if cnt[i] != 0:
        count += 1
print(count)