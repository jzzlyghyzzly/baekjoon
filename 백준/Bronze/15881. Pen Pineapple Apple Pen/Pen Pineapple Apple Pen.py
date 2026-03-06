import sys
input = sys.stdin.readline
n = int(input().strip())
ppap = list(input().strip())
PPAP =[]
cnt = 0
for c in ppap:
    PPAP.append(c)
    if ''.join(PPAP[-4:]) == "pPAp":
        cnt += 1
        PPAP =[]
print(cnt)