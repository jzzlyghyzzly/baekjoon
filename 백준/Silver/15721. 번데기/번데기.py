import sys
input= sys.stdin.readline
a = int(input().strip())
t = int(input().strip())
target = int(input().strip())

counts = [0,0]
total_shouts = 0
n =1

while True:
    pattern = [0,1,0,1]
    pattern.extend([0] * (n+1))
    pattern.extend([1] * (n+1))

    found =False
    for shout in pattern:
        counts[shout] += 1
        if shout == target and counts[shout] == t:
            print(total_shouts % a)
            found = True
            break
        total_shouts += 1
    if found:
        break
    n+=1