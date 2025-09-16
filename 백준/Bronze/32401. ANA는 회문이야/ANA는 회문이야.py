import sys
input= sys.stdin.readline
N = int(input().strip())
S = input().strip()
ANA_count = 0
for i in range(N):
    if S[i] != 'A':
        continue

    for j in range(i+2, N):
        if S[j] != 'A':
            continue

        inner = S[i+1:j]

        if inner.count('A') == 0 and inner.count('N') == 1:
            ANA_count += 1

print(ANA_count)