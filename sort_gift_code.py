def sort_gift_code(code): 
    result = ""

    for letter in sorted(code):
        result = result + letter

    return result
