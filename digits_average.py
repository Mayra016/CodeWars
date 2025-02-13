import math
def digits_average(x):
    result = []
    
    for digit in str(x):
        result.append(int(digit))
    
    while len(result) > 1: 
        result = [math.ceil((result[i] + result[i + 1]) / 2) for i in range(len(result) - 1)]
    

    return result[0]
