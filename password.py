def password_validator(st):
    upperCase = False
    lowerCase = False
    num = False
    
    for character in st:
        if character.isupper():
            upperCase = True
            
        if character.islower():
            lowerCase = True
        
        if character.isdigit():
            num = True
            
    return upperCase and lowerCase and num and len(st) >= 8
