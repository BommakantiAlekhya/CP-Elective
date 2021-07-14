# Write the function isFactor(f, n) that takes 
# two int values f and n, and returns True 
# if f is a factor of n, and False otherwise. 
# Note that every integer is a factor of 0.



def fun_isfactor(f, n):
    while f * f <= n:
        if f % n == 0:
            f /= n
            #return True
        else: f += 1
        #return False
print(fun_isfactor(2, 2))

