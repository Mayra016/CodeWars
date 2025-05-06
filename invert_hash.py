def invert_hash(dictionary):
    result = {value: key for key, value in dictionary.items()}
    return result
