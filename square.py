def square(num):
    result = ""

    if str(str(num)[0]) * len(str(num)) == str(num) and str(num)[0] != "9":
        return num
    
    for digit in str(num):
        result = result + str(int(digit) * int(digit))
        
    return int(result)
