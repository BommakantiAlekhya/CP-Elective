# hasConsecutiveDigits(n)  [10pts]
# Write the function hasConsecutiveDigits(n) that takes a possibly negative int value n and returns True if that 
# number contains two consecutive digits that are the same, and False otherwise.

def hasconsecutivedigits(n):
    n=abs(n)
    prev_digit= -1
    while (n > 0):
        one_digit = n%10
        n //=10
        if (prev_digit == one_digit):
            return True
        prev_digit=one_digit
        return False
    print(hasconsecutivedigits(int(input())))