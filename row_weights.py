def row_weights(array):
    teams = [0, 0]
    x = 0
    
    for i in range(0, len(array)):
        teams[x] += array[i]
        x = x + 1
        
        if x > 1:
            x = 0
    
    return (teams[0], teams[1])
