import sys
input = sys.stdin.readline

m = int(input().strip())

s = 0       # sum
xv = 0      # xor

out = []
for _ in range(m):
    q = input().split()
    t = int(q[0])

    if t == 1:
        v = int(q[1])
        s += v
        xv ^= v
    elif t == 2:
        v = int(q[1])
        s -= v
        xv ^= v
    elif t == 3:
        out.append(str(s))
    else:  # t == 4
        out.append(str(xv))

sys.stdout.write("\n".join(out))