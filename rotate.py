def rotate(xs: list, n: int) -> list:
    result = [None] * len(xs)
    
    for i in range(0, len(xs)):
        result[(i + n) % len(xs)] = xs[i]    
          
    return result
