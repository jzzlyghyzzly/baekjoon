import sys
input = sys.stdin.readline

board = list(map(int, input().split()))

twenty = board.index(20)
Alice_score = (board[twenty-1] + board[twenty] + board[(twenty+1)%20])/3
Bob_score = sum(board)/20

if Alice_score < Bob_score: 
    print('Bob')
elif Alice_score == Bob_score: 
    print('Tie')
else: 
    print('Alice')