import sys
input = sys.stdin.readline

while True:
    line = input().split()
    if not line:
        continue
    if line[0] == '0':
        break

    N = int(line[0])
    P = int(line[1])

    k = (P - 1) // 2 

    pages = [2*k + 1, 2*k + 2, N - 2*k, N - 2*k - 1]
    pages.remove(P)
    pages.sort()

    print(*pages)
