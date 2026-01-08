import sys
input = sys.stdin.readline

def patterns(s: str):
    even = s[0::2] 
    odd  = s[1::2] 

    if len(s) % 2 == 0:
        return even, odd
    else:
        return even + odd, odd + even

T = int(input().strip())
out = []

for _ in range(T):
    s = input().strip()
    first, second = patterns(s)
    out.append(first)
    out.append(second)

print("\n".join(out))
