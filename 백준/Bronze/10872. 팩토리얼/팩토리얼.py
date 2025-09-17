import sys

input = sys.stdin.readline
N = int(input().strip())
temp =1 
for i in range(1,N+1):
    temp *= i
    
print(temp)