# mostFrequentDigit(n) [10pts]
# Write the function mostFrequentDigit(n), that takes a non-negative integer n and returns the digit from 0 to 9 
# that occurs most frequently in it, with ties going to the smaller digit.
def c(x,d):
    count=0
    while(x>0):
        if(x%10==d):
            count+=1
        x=x//10
    return count
def mostfrequentdigit(n):
    n=abs(n)
    digit=0
    max=0
    count=0
    for i in range(10):
        count= c(n,i)
        if(count>max):
            max=count
            digit=i
        
    return digit