import sys
input =sys.stdin.readline
n = int(input().strip())
nums = []
for _ in range(n):
    nums.append(int(input().strip()))
nums.sort()
for c in nums:
    print(c)
    