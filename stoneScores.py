def determine_winner(board):
    bSum = 0
    wSum = 0
    
    for line in board:
        for field in line:
            if field == "B":
                bSum = bSum + 1
            if field == "W":
                wSum = wSum + 1
    
    if bSum > wSum:
        return ("B", bSum)
    
    if wSum > bSum:
        return ("W", wSum)
    
    if wSum == bSum:
        return ("T", bSum)
                
