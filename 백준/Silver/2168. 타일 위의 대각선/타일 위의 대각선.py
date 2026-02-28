# 타일 위의 대각선
import sys
input =sys.stdin.readline
def gcd(a,b):
    while b!= 0:
        a,b = b, a%b
    return a
n,m=map(int, input().split())
# 길이 1인 정사각형 타일 가로 x 세로 y 직사각형 벽에 빈틈없이 붙임 
# 직사각형벽에 대각선 하나를 그림 . 
# 그 중 대각선이 그려진 정사각형 타일이 생겨버림 
# x *y 개의 타일 중 대각선이 그려진 타일 개수 구하는 프로그램

# 정해진 공식 : 대각선이 지나가는 타일 개수 = n + m - gcd(n,m) 
print( n + m - gcd(n,m))