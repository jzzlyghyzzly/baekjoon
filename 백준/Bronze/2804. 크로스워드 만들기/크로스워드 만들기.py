
import sys
input =sys.stdin.readline
a, b = map(str,input().split())
n,m  =len(a), len(b)
# 1) 교차점 찾기, a에서 가장 먼저, 그 안에서 b도 가장 먼저
cross_col = cross_row = 0
found = False
for i in range(n):
    for j in range(m):
        if a[i] == b[j]:
            cross_col=i #a의 열 위치
            cross_row = j #b의 행 위치
            found =True
            break # 찾았으니까 
    if found:
        break

for r in range(m):
    line = []
    for c in range(n):
        if r == cross_row:
            line.append(a[c])
        elif c == cross_col:
            line.append(b[r])
        else: line.append('.')
    print(''.join(line)) # join 문자열을 출력 형태로 만드는 핵심 도구