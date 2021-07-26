# hasConsecutiveDigits(n)  [10pts]
# Write the function hasConsecutiveDigits(n) that takes a possibly negative int value n and returns True if that 
# number contains two consecutive digits that are the same, and False otherwise.

def hasconsecutivedigits(n):
    	# your code goes here
	n=abs(n)
	d=-1
	if (n==0):
		return False
	else:
		while (n!=0):
			a=n%10
			n//=10
			if (d==a):
				return True
			d=a
		return False
    