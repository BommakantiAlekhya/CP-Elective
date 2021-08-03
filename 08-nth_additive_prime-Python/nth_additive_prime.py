# Write the function fun_nth_additive_prime(n) that takes a non-negative int n 
# and returns the nth Additive Prime, which is a prime number such that 
# the sum of its digits is also prime. For example, 113 is prime and 1+1+3==5 and 5 
# is also prime, so 113 is an Additive Prime. fun_nth_additive_prime(0) returns 2




def prime(n):
    count=0
    if n>1:
        for i in range(1,n+1):
            if(n%i)==0:
                count +=1
        if count==2:
            return True
        else:
            return False

def sum(n):
    sum=0
    while n>0:
        digit=n%10
        digit=sum+digit
        n=n//10
    return sum

def addictive(n):
    if (not prime(n)):
        return False
    else:
        return True
  
    # return prime(sum(n))
print(addictive(98))