def calc_type(a, b, res) -> str:
    if res > a:
        if res == a + b:
            return 'addition'
        if res == a * b:
            return 'multiplication'
    else:
        if res == a - b:
            return 'subtraction'
    return 'division'
