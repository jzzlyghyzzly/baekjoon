import sys
input = sys.stdin.readline
n,m = map(int, input().split())
matrix =[]
for _ in range(n):
    matrix.append(list(map(int,input().strip())))
   
for i in range(0,n-1):
    for j in range(0, m-1):
        if matrix[i][j] and matrix[i+1][j] and matrix[i][j+1] and matrix[i+1][j+1]:
            print(1) 
            sys.exit(0)
            
print(0)