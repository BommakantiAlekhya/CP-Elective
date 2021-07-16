# Write the function getKthDigit(n, k) that takes 
# a possibly-negative int n and a non-negative int k, 
# and returns the kth digit of n, starting from 0, counting from the right.
# if the kth digit is not present return 0 



def fun_get_kth_digit(digit, k):
    digit = abs(digit)
    if (k == 0):
        return (digit%10)
    elif(k == 1):
        return int((digit%100)/10)
    elif(k == 2):
        return int((digit%1000)/100)
    else:
        return 0
    print(fun_get_kth_digit(int(input()), int(input())))
	
