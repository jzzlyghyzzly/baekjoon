import sys
input =sys.stdin.readline
n = int(input().strip())
for k in range(n):
    for i in range(5*n):
        print("@", end='')
    print("")
for i in range(3*n):
    for  j in range(n):
        print("@",end='')
    for j in range(3*n):
        print(" ",end='')
    for j in range(n):
        print("@",end='')
    print("")
for k in range(n):
    for i in range(5*n):
        print("@", end='')
    print("")