# hasConsecutiveDigits(n)  [10pts]
# Write the function hasConsecutiveDigits(n) that takes a possibly negative int value n and returns True if that 
# number contains two consecutive digits that are the same, and False otherwise.

def hasconsecutivedigits(n):
    n = abs(n)
    if n<100:
        return False
    res = list(map(int, str(n)))
    # sorted_list = sorted(res)
    p = -1
    while n!=0:
        k=n%10
        if k==p:
            return True
        p=k
        n=n//10
        return False
    