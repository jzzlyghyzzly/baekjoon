import sys
input = sys.stdin.readline
p,m,c = map(int,input().split())
X  = int(input().strip())
min = sys.maxsize
for i in range(1,p+1):
    for j in range(1,m+1):
        for k in range(1,c+1):
            val = abs((i+j)*(j+k)-X)
            if min > val:
                min = val 
print(min)