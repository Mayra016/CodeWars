def count_me(data):    
    if data == '':
        return ''
    
    previous = str(data)[0]
    times = 0
    result = ''

    
    for digit in data:
        print(digit)
        
        if digit.isdigit() == False:
            return ''
        
        if digit.isdigit() and digit == previous:
            times = times + 1
        else:
            if times != 0:
                result = result + str(times) + previous
            previous = digit
            times = 1
    if times != 0:
        result = result + str(times) + previous        
    return result
