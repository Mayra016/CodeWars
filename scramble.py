def scramble(strng, array):
    result = [''] * len(strng)
    
    for i in range(0, len(array)):
        result[array[i]] = strng[i]
        
    return ''.join(result)
