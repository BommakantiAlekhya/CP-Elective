# isPerfectSquare(n) [10pts]
# Write the function isPerfectSquare(n) that takes a possibly-non-int value, and returns True if
# it is an int that is a perfect square (that is, if there exists an integer m such that
# m**2 == n), and False otherwise. Do not crash on non-ints nor on negative ints.


import math
def isperfectsquare(n):
    n = int(n)
    m = math.sqrt(n)
    if (n>=0) and (n==m*m) and type(n)==int:
        return True
    else:
        return False
    #if (math.ceil(math.sqrt(n)))==math.floor(math.sqrt(n)):
        #return True
    #else:
        #return False
    print(isperfectsquare(5))

