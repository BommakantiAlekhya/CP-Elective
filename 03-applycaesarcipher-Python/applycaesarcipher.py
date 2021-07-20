# A Caesar Cipher is a simple cipher that works by shifting each letter in 
# the given message by a certain number. For example, if we shift the message 
# "We Attack At Dawn" by 1 letter, it becomes "Xf Buubdl Bu Ebxo"
# Write the function applyCaesarCipher(message, shift) which shifts the given 
# message by shift letters. You are guaranteed that message is a string, and 
# that shift is an integer between -25 and 25. Capital letters should stay capital 
# and lowercase letters should stay lowercase, and non-letter characters should not be changed. 
# Note that "Z" wraps around to "A". So, for example:
# assert(applyCaesarCipher("We Attack At Dawn", 1) == "Xf Buubdl Bu Ebxo")
# assert(applyCaesarCipher("zodiac", -2) == "xmbgya")

def cipher(i,shift):
    k=26 if shift<=0 else 0
    a=97 if i.islower() else 65
    p=(ord(i)+shift-a+k)%26
    return chr(a+p)

def fun_applycaesarcipher(msg, shift):
    out=""
    for i in msg:
        out=out+(cipher(i,shift) if i.isalpha() else i)
    return out
    




