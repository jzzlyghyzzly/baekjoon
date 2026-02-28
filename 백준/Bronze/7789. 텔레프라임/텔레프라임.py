import sys
input =sys.stdin.readline
n, m = map(int, input().split())
m = n + m*(10**6)

def is_prime(x):
    if x<2 :
        return False
    if x%2 == 0:
        return x == 2
    p = 3
    while p*p <= x:
        if x % p ==0 :
            return False
        p +=2 # 짝수는 애초에 소수가 아님
    return True
print("Yes" if is_prime(n) and is_prime(m) else "No")