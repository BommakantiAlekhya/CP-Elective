# A happy prime is a number that is both happy and prime. 
# Write the function nthHappyPrime(n) which takes a non-negative integer 
# and returns the nth happy prime number (where the 0th happy prime number is 7).



def isprime(x):
    count=0
    if x>1:
        for i in range(1,x+1):
            if(x%i)==0:
                count = count+1
        if count == 2:
            return True
        else:
            return False
def powerfulnumber(x):
    if(x==1):
        return True
    
    else:
        
        count=0
        count2=0
        for i in range(2,int(x/2)+1):
            if(x%i==0 and isprime(i)):
                count+=1
                if(x%(i*i)==0):
                    count2+=1
        print(count,count2)
        if(count==0 or count2==0):
            return False
        elif(count==count2):
            return True

    return False

def nthpowerfulnumber(n):

    found = 0
    guess = 0
    while (found <= abs(n)):
        guess += 1
        if(powerfulnumber(guess)):
            found += 1
    return guess