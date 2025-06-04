def connect_four_place(columns):
    result = []
    
    for i in range(0, 6):
        result.append(['-', '-', '-', '-', '-', '-', '-'])
        
    for x in range(0, len(columns)):
        move = 'Y' if x % 2 == 0 else 'R'
        
        for z in range(0, 6):
            if result[z][columns[x]] != '-':
                result[z - 1][columns[x]] = move
                break
            if z == 5 and result[z][columns[x]] == '-':
                result[z][columns[x]] = move
                break
    return result
