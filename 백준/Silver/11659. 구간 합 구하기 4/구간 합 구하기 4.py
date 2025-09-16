import sys

input = sys.stdin.readline

N, M = map(int, input().split()) # 하나 이상의 숫자를 입력 받고 싶을때
numbers = list(map(int, input().split())) # N개의 숫자 리스트 만듦

sum_array = [0] # 배열 초기화 같은 건가?
temp = 0 # ?
for i in numbers:
    temp += i
    sum_array.append(temp) # 합배열을 만든다는 데 temp가 뭐임 numbers 리스트에서 i번째 꺼 합하는겨?

for _ in range(M):
    start, end = map(int, input().split())
    print(sum_array[end]-sum_array[start-1])

