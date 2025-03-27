def tacofy(word): 
    result = []
    result.append("shell")
    for letter in word.lower():
        if letter in ('a', 'e', 'i', 'o', 'u'):
            result.append('beef')
        
        if letter == 't':
            result.append('tomato')
            
        if letter == 'l':
            result.append('lettuce')
            
        if letter == 'c':
            result.append('cheese')
            
        if letter == 'g':
            result.append('guacamole')
            
        if letter == 's':
            result.append('salsa')
            
    result.append("shell")
    return result
