import sys 
input= sys.stdin.readline
h, w= map(int, input().split())
chess = [list(input().strip()) for _ in range(h)]
answer = 64 #최대 
for i in range(h-7):
    for j in range(w-7):
        cnt_w = 0 # 시작하는 지점이 흰색일 경우 더 작음
        cnt_b = 0 # 시작하는 지점이 검은색일 경우 더 작음
        
        # chess 판 확인
        for x in range(8):
            for y in range(8):
                current = chess[i+x][j+y]
                loc = x+y
                if loc % 2==0:
                    if current != 'W':
                        cnt_w += 1
                    if current != 'B':
                        cnt_b += 1
                else:
                    if current != 'W':
                        cnt_b += 1
                    if current != 'B':
                        cnt_w += 1
        answer = min(answer, cnt_w, cnt_b)
print(answer)         
        