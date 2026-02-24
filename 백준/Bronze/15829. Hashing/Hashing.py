import sys
input = sys.stdin.readline
n =int(input().strip())
l = list(map(str,input().strip()))
for i in range(n):
    l[i] = ord(l[i])- 96

# 31 제곱 * 문자열 아스키코드 mod 1234567891
sum =0 
M = 1234567891
for i in range(n):
    sum += (31**i)*l[i]

result = sum % M
print(result)