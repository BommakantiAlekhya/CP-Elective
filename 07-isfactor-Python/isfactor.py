# Write the function isFactor(f, n) that takes 
# two int values f and n, and returns True 
# if f is a factor of n, and False otherwise. 
# Note that every integer is a factor of 0.

from attr import resolve_types

def fun_isfactor(f, n):
    return False
if n==0 and f==0:
    return True
elif f==0:
    return False
elif n==0:
    return True
elif n%f==0:
    return True
else:
    return False

    

