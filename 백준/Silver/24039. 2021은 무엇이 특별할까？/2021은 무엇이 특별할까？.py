# 2021은 무엇이 특별할까 ?
import sys
input =sys.stdin.readline
n = int(input().strip())
# 2021은 소수 중 연속한 소수들의 곱,  어떤수가 연속한 소수의 곱으로 이루어져 있으면 특별한 수 라고 부르기로 함, 주어진 수보다 큰 특별한 수 중 가장 작은 수
# 그니까 그 다음으로 큰 특별한 수 

#  1<= N <=10000 , 소수는 아무리 커봤자 8827보단 작거나 같을 것 
prime = [] # 2 도 추가 해야함
def is_prime(x):
    if x < 2:
        return False
    if x% 2== 0:
        return x == 2
    d = 3
    #   prime = True
    while d*d <= x:
        if x % d == 0:
            return False
        else: d += 2
    return True
for i in range(2,104):
    if is_prime(i):
        prime.append(i)

# print(*prime) # 소수 저장된 거 확인
multi = []
for i in range(len(prime)-1):
    multi.append(prime[i]*prime[i+1])


for value in multi:
    if value > n:
        print(value)
        break

