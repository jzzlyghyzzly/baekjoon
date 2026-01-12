import sys
input = sys.stdin.readline

n, k = map(int, input().split())
time = str(k)

cnt = 0
for h in range(n+1):
    for m in range(60):
        for s in range(60):
            t = f"{h:02d}{m:02d}{s:02d}"
            if time in t:
                cnt += 1

print(cnt)            