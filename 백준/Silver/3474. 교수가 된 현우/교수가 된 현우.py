import sys
input =sys.stdin.readline
n = int(input().strip())

for _ in range(n):
    i = 0
    result = 0
    t = int(input().strip())
    # 5의 제곱수로 나누면 되나봄
    while t >= 5**i:
        i+=1
    # print("차례대로 t값과, i값입니다.",t, i)
    for j in range(1, i):
        result += t // (5**j) 
        # print("점검하겠습니다 t%5**j", t%(5**j))
    print(result)