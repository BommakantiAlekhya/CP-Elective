# largestPerfectSquare(n) [10 pts]
# Write the function largestPerfectSquare(n) that takes a non-negative int n, and returns  the largest perfect
# square that is no larger than n. For example:
# assert(largestPerfectSquare(24) == 16)
# assert(largestPerfectSquare(25) == 25)
# assert(largestPerfectSquare(26) == 25)
# Hint: you may wish to use a similar approach to how you solved isPerfectSquare on the hw.
# Another hint: This can be written using just one or two lines of Python.

import math
def largestperfectsquare(n):
	return int(math.sqrt(n))*int(math.sqrt(n))

    	
    # while n > 0:
    #     i = 1
    #     while i <= n//2:
    #         square = i*i
    #         if square == n:
    #             return square
    #         else:
    #             i += 1
    #     n -= 1
    # return 1