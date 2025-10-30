def repeats(arr):
    sum = 0
    
    for digit in arr:
        if arr.count(digit) == 1:
            sum = sum + digit
    
    return sum
