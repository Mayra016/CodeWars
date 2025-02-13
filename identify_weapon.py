import json

def identify_weapon(character):
    names = {
        "laval" : 'Laval-Shado Valious',
        "cragger" : 'Cragger-Vengdualize',
        "lagravis" : 'Lagravis-Blazeprowlor',
        "crominus" : 'Crominus-Grandorius',
        "tormak" : 'Tormak-Tygafyre',
        "liella" : 'LiElla-Roarburn',
    }
    
    return names.get(character.lower(), "Not a character")
    
