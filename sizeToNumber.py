def size_to_number(size):
    num = 0;
    
    if size.count('s') + size.count('m') + size.count('l') != 1 or 'm' in size and 'x' in size:
        return None
    
    if 's' in size:
        num = 36
        for x in range(size.count('x')):
            num = num - 2
    if 'm' in size:    
        num = 38
        for x in range(size.count('x')):
            num = num - 2
        
    if 'l' in size: 
        num = 40
        if size[-1] == 'x':
            return None
        for x in range(size.count('x')):
            num = num + 2
     
    size = size.replace('x', '')
    size = size.replace('s', '')
    size = size.replace('m', '')
    size = size.replace('l', '')
    
    return num if len(size) == 0 else None
