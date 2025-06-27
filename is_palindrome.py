def is_palindrome(s):
    result = ""
    
    for i in range(len(s) - 1, -1 , -1):
        result = result + s[i]
        
    return True if s.lower() == result.lower() else False
