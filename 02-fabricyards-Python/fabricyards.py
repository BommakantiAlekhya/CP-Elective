# fabricyards(inches)
# Fabric must be purchased in whole yards, so purchasing just 1 inch 
# of fabric requires purchasing 1 entire yard. With this in mind, 
# write the function fabricYards(inches) that takes the number of 
# inches of fabric desired, and returns the smallest number of whole 
# yards of fabric that must be purchased.

# fabricexcess(inches)
# Write the function fabricexcess(inches) that takes the number of 
# inches of fabric desired and returns the number of inches of excess 
# fabric that must be purchased (as purchases must be in whole yards).
# Hint: you may want to use fabricyards, which you just wrote!


def fabricyards(inches):
    	# Your code goes here...
	unity=36
	if(inches==0):
    		return(0)
	if(1<=inches<=unity):
    		return(1)
	if(36<=inches<=unity*2):
			return(2)
	if(72<=inches<=unity*3):
			return(3)

def fabricexcess(inches):
	# Your code goes here...
	unity=36
	if(inches==0):
		return 0
	if(1<=inches<=unity):
		return abs(unity-inches)
	if(36<=inches<=unity*2):
    		return abs(unity*2-inches)		
	if(72<=inches<=unity*3):
    		return abs(unity*3-inches)
	if(108<=inches<unity*4):
    		return abs(unity*4-inches)