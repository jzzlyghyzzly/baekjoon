import sys
input= sys.stdin.readline
n, l =map(int, input().split())
pos = list(map(int, input().split()))
pos.sort()
tape = 1
end = pos[0] -0.5 + l # 첫번째 테이프가 덮는 끝 
for i in range(1, n):
    if pos[i] + 0.5 > end:
        tape+= 1
        end = pos[i] - 0.5 + l
print(tape)