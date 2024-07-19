def double_char(s):
    result = ""
    
    for letter in s:
        for i in range(0,2):
            result = result + letter
            
    return result
