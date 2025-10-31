def find_rarest_pepe(pepes):
    count = len(pepes)
    finalName = []
    unique = set(pepes)
    
    for name in unique:
        sum = pepes.count(name)
        
        if sum == count:
            finalName.append(name)
        if sum < count:
            count = sum
            finalName = []
            finalName.append(name)
        
    if count >= 5:
        return "No rare pepes!"
    
    return finalName[0] if len(finalName) == 1 else finalName
