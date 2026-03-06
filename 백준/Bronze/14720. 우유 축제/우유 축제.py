# 우유 축제 
import sys
input = sys.stdin.readline
n = int(input().strip())
store = list(map(int, input().split()))

need = 0
cnt = 0

for milk in store:
    if milk == need: # 딸기우유 마시기 시작하면? 
        cnt += 1
        need = (need + 1) % 3

print(cnt)