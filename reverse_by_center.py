def reverse_by_center(s):
    rounded = len(s) // 2
    if len(s) % 2 == 0:
        first = s[0:rounded]
        second = s[rounded:]
        return second + first
    else:  
        first = s[0:rounded]
        second = s[rounded + 1:]
        return second + s[rounded] + first
