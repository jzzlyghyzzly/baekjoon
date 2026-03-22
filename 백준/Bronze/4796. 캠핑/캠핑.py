import sys
input = sys.stdin.readline
loop = True
cnt = 0
day = []
while loop:
    l,p,v = map(int, input().split())
    if l == 0 and p == 0 and v == 0:
        loop = False
    else:
        day.append((v//p)*l + min(v%p, l)) # min 처리안하면, 사용가능 일수 over 할 수 있음 
        cnt += 1
for i in range(cnt):
    print(f"Case {i+1}: {day[i]}")
# 캠핑장을 연속하는 p일 중, L일동안만 사용할 수 있음, v일 짜리 휴가를 시작함 . 캠핑장을 최대로 사용할 수 있는 일 수