import sys
input= sys.stdin.readline
n = int(input().strip())
n = 1000 - n
sum = 0
while n:
    if n >= 500:
        sum += n//500
        n %= 500
    elif n >=100:
        sum += n//100
        n %= 100
    elif n >= 50:
        sum += n//50
        n %= 50
    elif n >= 10:
        sum += n//10
        n %= 10
    elif n >= 5:
        sum += n//5
        n %= 5
    else:
        sum += n
        break
print(sum)