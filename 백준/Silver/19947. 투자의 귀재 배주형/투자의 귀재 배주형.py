# 투자의 귀재 배주형
import sys
input= sys.stdin.readline
h, y=map(int,input().split())
dp = [0] *(y+1)
dp[0] = h
for t in range(1, y+1):
    best = dp[t-1] *105//100 # A (1년)
    if t>=3:
        best = max(best, dp[t-3] *120//100) # B (3년)
    if t>=5:
        best = max(best, dp[t-5] *135//100) # C (5년)
    dp[t] =best

print(dp[y])