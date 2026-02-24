import sys
input = sys.stdin.readline

whats = [input().strip() for _ in range(3)]

# 1) 3줄 중 "정수"인 줄 찾기
idx = -1
base = None
for i, s in enumerate(whats):
    try:
        base = int(s)   # 정수로 변환 가능하면
        idx = i         # 그 위치 기억
        break
    except ValueError:
        pass

# 2) 정수 위치에 따라 다음에 올 숫자 계산
# idx==0 -> +3, idx==1 -> +2, idx==2 -> +1
x = base + (3 - idx)

# 3) FizzBuzz 규칙 출력
if x % 15 == 0:
    print("FizzBuzz")
elif x % 3 == 0:
    print("Fizz")
elif x % 5 == 0:
    print("Buzz")
else:
    print(x)