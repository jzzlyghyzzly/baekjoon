import sys
input = sys.stdin.readline

N, K = map(int, input().split())
num = list(map(int, input().split()))
num.sort(reverse=True) 
best = 0
def dfs(cur):
    global best
    if cur > N:
        return
    if cur > best:
        best = cur

    for d in num:
        nxt = cur * 10 + d
        if nxt > N:
            continue
        dfs(nxt)
dfs(0)
print(best)