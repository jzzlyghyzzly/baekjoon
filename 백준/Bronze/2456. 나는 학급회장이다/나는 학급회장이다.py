import sys
input = sys.stdin.readline

n = int(input().strip())

score = [0, 0, 0]    # 총점
cnt3  = [0, 0, 0]    # 3점 개수
cnt2  = [0, 0, 0]    # 2점 개수

for _ in range(n):
    a, b, c = map(int, input().split())
    votes = [a, b, c]
    for i in range(3):
        score[i] += votes[i]
        if votes[i] == 3:
            cnt3[i] += 1
        elif votes[i] == 2:
            cnt2[i] += 1

# 비교 키: 총점 -> 3점개수 -> 2점개수
keys = [(score[i], cnt3[i], cnt2[i]) for i in range(3)]
best = max(keys)

winners = [i for i in range(3) if keys[i] == best]

if len(winners) >= 2:
    print(0, best[0])
else:
    w = winners[0]
    print(w + 1, best[0])
