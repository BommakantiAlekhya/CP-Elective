# Write the function fun_nth_palindromic_prime(n) that takes 
# a non-negative int n and returns the nth palindromic Prime, 
# which is a palidrome number such that 
# it is also a prime. 

# For example, 313 is a palindrome and it is prime 
# so 313 is an palindrome Prime. fun_nth_palindrome_prime(0) 
# returns 2

def ispalindromeprime(n):
    
    reverse=int(str(n)[::-1])
    if n==reverse:
        count=0
        # if x>1:
        for i in range(1,n+1):
            if(n%i)==0:
                count = count+1
        if count == 2:
            return True
        else:
            return False
    else:
        return False
print(ispalindromeprime(2))