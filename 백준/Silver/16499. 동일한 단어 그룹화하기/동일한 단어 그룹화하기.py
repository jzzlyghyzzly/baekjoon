import sys
input= sys.stdin.readline
n = int(input().strip())
group =set()
for _ in range(n):
    word = input().strip()
    sorted_word = ''.join(sorted(word))
    group.add(sorted_word)
print(len(group))