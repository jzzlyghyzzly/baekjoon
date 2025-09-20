import sys

input = sys.stdin.readline

result = [] # right, wrong 담을 배열? 필요한가

# for문으로 0 0 0입력될 때 까지 숫자 입력 받아야함
while True:
    a, b, c = map(int, input().split())
    if a==0 and b==0 and c==0:
        break
    
    nums = sorted([a,b,c]) # 가장 큰 수를 빗변으로 하는 함수
    if nums[0]**2 + nums[1]**2 == nums[2]**2:
        print("right")
    else:
        print("wrong")