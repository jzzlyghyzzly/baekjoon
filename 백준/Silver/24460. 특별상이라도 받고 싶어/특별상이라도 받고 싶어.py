import sys
input = sys.stdin.readline

N = int(input().strip())
A = [list(map(int, input().split())) for _ in range(N)]

def pick(x, y, size):
    if size == 1:
        return A[x][y]

    half = size // 2
    v1 = pick(x, y, half)                 
    v2 = pick(x, y + half, half)          
    v3 = pick(x + half, y, half)          
    v4 = pick(x + half, y + half, half)   

    vals = [v1, v2, v3, v4]
    vals.sort()
    return vals[1]  

print(pick(0, 0, N))