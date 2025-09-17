import sys

input = sys.stdin.readline

number = list(map(int, input().split()))

sum = 0
for n in number:
    sum = sum + n*n

print(sum%10)