import sys
input =sys.stdin.readline
n = int(input().strip())
for _ in range(n):
    num = list(map(int, input().strip()))
    # print(*num)
    sum = 0
    for i in range(16):
        if i % 2 == 0 : #짝수 번쨰
            num[i] = num[i]*2
            if num[i] >= 10:
                num[i] = num[i]%10 + num[i]//10
        sum += num[i]
    if sum % 10 == 0:
        print("T")
    else: print("F")