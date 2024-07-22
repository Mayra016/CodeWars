def problem(a):
    if not isinstance(a, (int, float)):
        return "Error"
    else:
        return a * 50 + 6
