import sys
input = sys.stdin.readline

n = int(input().strip())
num = list(map(int, input().split()))

def total_sum(x,k):
    m = x // k
    return k* m*(m+1) //2 

for n in num:
    res = (total_sum(n,3) + total_sum(n,7) - total_sum(n,21))
    print(res)