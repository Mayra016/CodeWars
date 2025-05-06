def trace(matrix):
    sum = 0
    empty = []
    for sequency in matrix:
        if len(matrix) != len(sequency):
            return None
    
    for i in range(len(matrix)):
        sum = sum + matrix[i][i]
        
    if sum == 0 and len(matrix) < 1:
        return None
        
    return sum
