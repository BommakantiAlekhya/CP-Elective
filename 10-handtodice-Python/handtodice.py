# Write the (very short) function handtodice(hand) that takes a hand, which is a 3-digit
# integer, and returns 3 values, each of the 3 dice in the hand. For example:
# assert(handToDice(123) == (1,2,3))
# assert(handToDice(214) == (2,1,4))
# assert(handToDice(422) == (4,2,2))
# Hint: You might find // and % useful here, and also getKthDigit().

def getKthDigit(n, k):
    n = int(n / 10 ** k)
    return abs(n) % 10

def handtodice(hand):
    n1 = getKthDigit(hand, 2)
    n2 = getKthDigit(hand, 1)
    n3 = getKthDigit(hand, 0)
    return (n1, n2, n3)

