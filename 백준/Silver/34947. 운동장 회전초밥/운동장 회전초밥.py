import sys
import math
input  = sys.stdin.readline
n,t = map(int, input().split())
r, d, th, w = map(int, input().split())
w = w / 100
theta  =th * math.pi /180

def distance(rad):
    return n* (2*d + 4*rad*math.sin(math.pi/2 - theta/2) + 2*rad*theta)

eun = r - 0.5*w 
hwa = r - 1.5*w
min = r - 2.5*w  
len_eun = distance(eun)
len_hwa = distance(hwa)
len_min = distance(min)

print((len_eun - len_min) / t)
print((len_eun - len_hwa) / t)