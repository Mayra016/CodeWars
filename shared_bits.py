def shared_bits(a, b):
    same = bin(a & b) # obtain just the shared bits
    return same.count('1') >= 2
