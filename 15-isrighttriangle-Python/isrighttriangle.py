# isrighttriangle(x1, y1, x2, y2, x3, y3)[5pts]
# Write the function isrighttriangle(x1, y1, x2, y2, x3, y3) that takes 6 int or float values that
# represent the vertices (x1,y1), (x2,y2), and (x3,y3) of a triangle, and returns True if that is
# a right triangle and False otherwise. You may wish to write a helper function,
# distance(x1, y1, x2, y2), which you might call several times. Also, remember to use
# almostEqual (instead of ==) when comparing floats.

def isrighttriangle(x1, y1, x2, y2, x3, y3):
    A= ((x1-x2)**2)+((y1-y2)**2)
    B= ((x1-x3)**2)+((y1-y3)**2)
    C= ((x2-x3)**2)+((y2-y3)**2)
    if ((A > 0 and B > 0 and C > 0) and (A == (B + C) or B == (A + C) or C == (A + B))):
        return True
    else:
        return False
    print(isrighttriangle(x1, y1, x2, y2, x3, y3))
