def decode(s):
    result = ""
    
    for i in range(0, len(s)):
        if s[i].isalpha():
            num = ord(s[i]) - 96

            if num % 2 == 0:
                result = result + '1'
            else:
                result = result + '0'
        else:
            result = result + s[i]
            
    return result
