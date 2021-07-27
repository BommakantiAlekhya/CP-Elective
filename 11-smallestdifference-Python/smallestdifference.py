# Write the function smallestDifference(a) that takes a list of integers and returns 
# the smallest absolute difference between any two 
# integers in the list. If the list is empty, return -1. For example:
#       assert(smallestDifference([19,2,83,6,27]) == 4)
# The two closest numbers in that list are 2 and 6, and their difference is 4.

from operator import abs
def readArray():
    s = input().split(" ")
    l = []
    for i in s:
        if len(i) != 0:
            l.append(int(i))
    return l

def smallestdifference(a):
    if(a==[]):
        return(-1)
    d=10**20
    for i in range(len(a)-1):
        for j in range(i+1,len(a)):
            if(abs(a[i]-a[j])<d):
                d=abs(a[i]-a[j])
    return (d)