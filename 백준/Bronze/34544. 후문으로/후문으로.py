import sys
input = sys.stdin.readline

N = int(input().strip())
floor = 1 

for _ in range(N):
    A, B = map(int, input().split())
    if A < 0:
        A += 1
    if B < 0:
        B += 1

    before = floor          
    floor += (B-A)

    if before > 0 and floor <= 0:
        floor -= 1         
    elif before <= 0 and floor > 0:
        floor += 1        

print(floor)