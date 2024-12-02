def build_or_buy(hand):
    available = []
    ok = True

    objects = {
        "road": "bw",
        "settlement": "bwsg",
        "city": "ooogg",
        "development": "osg"        
    }

    for obj in objects:
        for letter in objects[obj]:
            if objects[obj].count(letter) > hand.count(letter):
                ok = False
                
        if ok == True:
            available.append(obj)

        else:    
            ok = True

    return available
