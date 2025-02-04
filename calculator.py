def calculator(distance, bus_drive, bus_walk):

    
    busTime = (bus_drive / bus) + (bus_walk / walk)
    walkTime = distance / walk
    
    if walkTime > 2:
        return "Bus"
    if walkTime < 1/6: 
        return "Walk"
    if walkTime == busTime: 
        return "Walk"
    

    return "Bus" if busTime < walkTime else "Walk"
