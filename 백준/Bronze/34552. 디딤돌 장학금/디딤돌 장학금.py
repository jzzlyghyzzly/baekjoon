import sys
input = sys.stdin.readline

M_i = list(map(int, input().split()))
N=int(input().strip())

total = 0

for _ in range(N):
    B, L, S= input().split()
    B = int(B)
    L = float(L)
    S = int(S)
    if L >= 2.0 and S>= 17:
        total += M_i[B]
        
print(total)