import sys
input = sys.stdin.readline

t = int(input().strip())

apart = [[0 for _ in range(15)] for _ in range(15)]

for i in range(15):
    apart[i][1] = 1          # 모든 층 1호 = 1
for i in range(1, 15):
    apart[0][i] = i          # 0층 i호 = i

for k in range(1, 15):
    for n in range(2, 15):
        apart[k][n] = apart[k][n-1] + apart[k-1][n]

for _ in range(t):
    k = int(input().strip())
    n = int(input().strip())
    print(apart[k][n])