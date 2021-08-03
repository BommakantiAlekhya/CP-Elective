"""You're going to write a binary search function.
You should use an iterative approach - meaning
using loops.
Your function should take two inputs:
a Python list to search through, and the value
you're searching for.
Assume the list only has distinct elements,
meaning there are no repeated values, and 
elements are in a strictly increasing order.
Return the index of value, or -1 if the value
doesn't exist in the list."""

def binary_search(input_array, value): 
    # Your code goes here 
    begin_index = 0
    end_index = len(input_array) - 1
   
    while begin_index <= end_index:
        midpoint = begin_index + (end_index - begin_index) // 2
        midpoint_value = input_array[midpoint]
        if midpoint_value == value:
            return midpoint

        elif value < midpoint_value:
            end_index = midpoint - 1

        else:
            begin_index = midpoint + 1

    return -1