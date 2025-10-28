import sys
input = sys.stdin.readline

N = int(input().strip())
W = int(input().strip())

score = N * 10

if N == 5:
    score += 70
elif N >= 3:
    score += 20

if W > 1000:
    score -= 15
    if score < 0:
        score = 0

print(score)