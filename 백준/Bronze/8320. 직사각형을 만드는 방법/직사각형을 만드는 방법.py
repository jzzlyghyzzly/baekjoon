import sys
input =sys.stdin.readline
n = int(input().strip())
nemo = 0
for i in range(1,n+1):
    j = n //i 
    if j < i : 
        break
    nemo += (j - i +1)
print(nemo)