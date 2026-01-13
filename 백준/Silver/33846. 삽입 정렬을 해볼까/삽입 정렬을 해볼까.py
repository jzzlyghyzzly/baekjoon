import sys
input= sys.stdin.readline
n,t = map(int, input().split())
arr= list(map(int, input().split()))
first= sorted(arr[:t])
result = first + arr[t:]
print(*result)