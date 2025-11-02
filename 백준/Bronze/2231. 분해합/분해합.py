import sys
input =sys.stdin.readline
n = int(input().strip())
result  =0
for i in range(1,n+1):
    nums = list(map(int,str(i)))
    s = i + sum(nums)
    if s ==n:
        result = i
        break
print(result)