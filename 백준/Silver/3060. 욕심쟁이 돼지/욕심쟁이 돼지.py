import sys
input = sys.stdin.readline
n = int(input().strip())
for _ in range(n):
    amount = int(input().strip())
    yes_pig = list(map(int, input().split()))
    day = 1

    while True:
        if sum(yes_pig) > amount:
            print(day)
            break

        today_pig = [0] * 6
        for i in range(6):
            if i % 2 == 0:
                today_pig[i] = yes_pig[i] + yes_pig[1] + yes_pig[3] + yes_pig[5]
            else:
                today_pig[i] = yes_pig[i] + yes_pig[0] + yes_pig[2] + yes_pig[4]

        yes_pig = today_pig
        day += 1
