import sys
input = sys.stdin.readline

word = input().strip()
score = [0]*len(word)

score[0]= 1
for i in range(1, len(word)):
    if word[i-1] < word[i]:
        score[i] += score[i-1]+1
    else:
        score[i] +=1 

print(sum(score))