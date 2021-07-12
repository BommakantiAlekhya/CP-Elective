from isLegalSudoku import *

print()
print ("Checking areLegalValues function...")

assert areLegalValues([1,2,3,4,5,6,7,8,0]) == True
assert areLegalValues([1,2,3,4,5,6,7,8,9]) == True
assert areLegalValues([1,2,3,4,5,0,0,8,0]) == True
assert areLegalValues([0,0,0,0,0,0,0,0,0]) == True
assert areLegalValues([1,1,3,4,5,6,7,8,0]) == False
assert areLegalValues([1,8,2,2,3,3,4,4,5]) == False
assert areLegalValues([-1,1,2,2,3,3,4,4,5]) == False
assert areLegalValues([1,1,2,2,3,3,4,4,10]) == False
assert areLegalValues([1,2,3,4,5,6,7,8,10]) == False

print ("All test cases passed....")

print()
print ("Checking for isLegalRow....")
board = [
            [1,2,3,4,5,6,7,8,9],
            [5,0,8,1,3,9,6,2,4],
            [4,9,6,8,7,2,1,5,3],
            [9,5,2,3,8,1,4,6,7],
            [6,4,1,2,9,7,8,3,5],
            [3,8,7,5,6,4,0,9,1],
            [7,1,9,6,2,3,5,4,8],
            [8,6,4,9,1,5,3,7,2],
            [2,3,5,7,4,8,9,1,6]
        ]

assert isLegalRow(board, 0) == True
assert isLegalRow(board, 1) == True
assert isLegalRow(board, 2) == True
assert isLegalRow(board, 3) == True
assert isLegalRow(board, 4) == True
assert isLegalRow(board, 5) == True
assert isLegalRow(board, 6) == True
assert isLegalRow(board, 7) == True
assert isLegalRow(board, 8) == True
assert isLegalRow(board, 9) == False

print ("All test cases passed....")

print()
print ("Checking isLegalColumn.....")
board = [
            [1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9] ,
            [5 ,0 ,8 ,1 ,3 ,9 ,6 ,2 ,4] ,
            [4 ,9 ,6 ,8 ,7 ,2 ,1 ,5 ,3] ,
            [9 ,5 ,2 ,3 ,8 ,1 ,4 ,6 ,7] ,
            [6 ,4 ,1 ,2 ,9 ,7 ,8 ,3 ,5] ,
            [3 ,8 ,7 ,5 ,6 ,4 ,0 ,9 ,1] ,
            [7 ,1 ,9 ,6 ,2 ,3 ,5 ,4 ,8] ,
            [8 ,6 ,4 ,9 ,1 ,5 ,3 ,7 ,2] ,
            [2 ,3 ,5 ,7 ,4 ,8 ,9 ,1 ,6]
        ]

assert isLegalCol(board, 0) == True
assert isLegalCol(board, 1) == True
assert isLegalCol(board, 2) == True
assert isLegalCol(board, 3) == True
assert isLegalCol(board, 4) == True
assert isLegalCol(board, 5) == True
assert isLegalCol(board, 6) == True
assert isLegalCol(board, 7) == True
assert isLegalCol(board, 8) == True
assert isLegalCol(board, 9) == False
print ("All test cases passed....")


print()
print("Checking isLegalBlock....")
assert isLegalBlock(board, 0) == True
assert isLegalBlock(board, 1) == True
assert isLegalBlock(board, 2) == True
assert isLegalBlock(board, 3) == True
assert isLegalBlock(board, 4) == True
assert isLegalBlock(board, 5) == True
assert isLegalBlock(board, 6) == True
assert isLegalBlock(board, 7) == True
assert isLegalBlock(board, 8) == True
assert isLegalBlock(board, 9) == False
print ("All test cases passed....")

print()
print("Checking isLegalSudoku....")

true_board = [
            [1,2,3,4,5,6,7,8,9],
            [5,7,8,1,3,9,6,2,4],
            [4,9,6,8,7,2,1,5,3],
            [9,5,2,3,8,1,4,6,7],
            [6,4,1,2,9,7,8,3,5],
            [3,8,7,5,6,4,2,9,1],
            [7,1,9,6,2,3,5,4,8],
            [8,6,4,9,1,5,3,7,2],
            [2,3,5,7,4,8,9,1,6]
        ]

assert isLegalSudoku(true_board) == True

false_board = [
            [1,2,3,4,5,6,7,8,9],
            [5,7,8,1,3,9,6,2,4],
            [4,9,6,8,7,2,1,5,3],
            [9,5,2,3,8,1,4,6,7],
            [6,4,1,2,9,7,8,3,5],
            [3,8,7,5,6,4,2,9,1],
            [7,1,9,6,2,3,5,4,8],
            [8,6,4,9,1,5,3,7,2],
            [2,3,5,7,4,8,9,1,2]
        ]
assert isLegalSudoku(false_board) == False


valid_board1 = [[2, 7, 4, 1, 6, 8, 9, 3, 5], [8, 1, 6, 3, 9, 5, 4, 7, 2], [5, 3, 9, 7, 4, 2, 6, 1, 8], [4, 2, 3, 8, 7, 6, 1, 5, 9], [9, 5, 1, 2, 3, 4, 7, 8, 6], [6, 8, 7, 5, 1, 9, 3, 2, 4], [3, 4, 5, 6, 2, 7, 8, 9, 1], [7, 6, 2, 9, 8, 1, 5, 4, 3], [1, 9, 8, 4, 5, 3, 2, 6, 7]]
valid_board2 = [[7, 5, 2, 6, 9, 8, 4, 1, 3], [6, 9, 8, 4, 1, 3, 7, 5, 2], [4, 1, 3, 7, 5, 2, 6, 9, 8], [1, 2, 4, 5, 8, 7, 9, 3, 6], [9, 3, 6, 1, 2, 4, 5, 8, 7], [5, 8, 7, 9, 3, 6, 1, 2, 4], [2, 7, 1, 8, 6, 5, 3, 4, 9], [3, 4, 9, 2, 7, 1, 8, 6, 5], [8, 6, 5, 3, 4, 9, 2, 7, 1]]
assert isLegalSudoku(valid_board1) == True
assert isLegalSudoku(valid_board2) == True

print("All test cases passed...")
