import sys
input =sys.stdin.readline
n = int(input().strip())
nums = list(map(int, input().split()))
i,j = 0,0
d =[1]*n
for i in range(1,n):
    for j in range(i):
        if nums[i] > nums[j]:
            d[i] = max(d[i], d[j]+1)
print(max(d))     
            