import sys
input= sys.stdin.readline

while True:
    l = input().strip()
    if l == "0":
        break

    palin  = True
    for i in range(len(l)//2): # len(l) 이 4일때, 0 ~ 1
        if l[i] != l[len(l) - (i+1)]:
            palin = False
            break
    print("yes" if palin else "no")