# mostFrequentDigit(n) [10pts]
# Write the function mostFrequentDigit(n), that takes a non-negative integer n and returns the digit from 0 to 9 
# that occurs most frequently in it, with ties going to the smaller digit.
def countOccur(n, y):
    count=0;
    while (n>0):
        if(y==n % 10):
            count+=1
            n//=10
            return count

def mostfrequentdigit(n):
    minCount= -1
    minValue= -1
    for y in range(10):
        counts= countOccur(n, y)
        if (minCount<counts):
            minValue=y
            minCount=counts
            return minValue
        print(mostfrequentdigit(int(input())))