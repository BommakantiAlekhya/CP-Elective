# Write the function circlesIntersect(x1, y1, r1, x2, y2, r2) 
# that takes 6 numbers (ints) -- x1, y1, r1, x2, y2, r2 -- 
# that describe the circle centered at (x1,y1) with radius r1, 
# and the circle centered at (x2,y2) with radius r2, and returns True 
# if the two circles intersect and False otherwise.
import math
def fun_circlesintersect(x1, y1, r1, x2, y2, r2):
    print("Input x1, y1, r1, x2, y2, r2:")
    x1,y1,r1,x2,y2,r2 = [float(i) for i in input().split()]
    d = math.sqrt((x1-x2)**2 + (y1-y2)**2)
    if d < r1-r2:
        print("C2  is in C1")
    elif d < r2-r1:
        print("C1  is in C2")
    elif d > r1+r2:
        print("Circumference of C1  and C2  intersect")
        return True
    else:
        print("C1 and C2  do not overlap")
        return False 
