
import sys

input =sys.stdin.readline

A = int(input().strip())
B = int(input().strip())
C = int(input().strip())

result = A*B*C
# 카운트할 배열을 하나 생성(길이가 10인 0~9)
count_arr = [0] * 10 # 파이썬 배열 생성하는 방법

# int형이 result를 문자열로 for문으로 문자 하나하나 보면서
# 사용된 숫자 카운트를 해야댐
for n in str(result): 
    count_arr[int(n)] += 1 # 문자열 다시 정수형으로

for i in range(0, len(count_arr)):
    print(count_arr[i])