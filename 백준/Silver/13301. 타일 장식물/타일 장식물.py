import sys
input = sys.stdin.readline
n = int(input().strip())
leng = [1,1]
for i in range(2, n+1):
    leng.append(leng[i-2] + leng[i-1])
print(2*(leng[n-1]+leng[n]))