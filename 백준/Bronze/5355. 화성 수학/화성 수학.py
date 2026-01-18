import sys
input =sys.stdin.readline
n = int(input().strip())
for _ in range(n):
    cac = list(map(str, input().split()))
    result = float(cac[0])
    for i in range(1,len(cac)):
        if '#' == cac[i]:
            result -= 7
        if '%' == cac[i]:
            result += 5
        if '@' == cac[i]: 
            result *= 3    
    # print(result)
# 출력 포맷팅 )-> print(f"{result:. 2f}")
    print(f"{result:.2f}")