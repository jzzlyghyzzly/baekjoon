import sys
input= sys.stdin.readline
n= int(input().strip())
mod= 1000000000
if n ==0:
    print(0) 
    print(0)
    sys.exit(0)
elif n >1:
    print(1)
else:
    print(-1 if abs(n)%2==0 else 1)
k = abs(n)
a,b = 0,1
for _ in range(k):
    a,b = b, (a+b)%mod
print(a)
