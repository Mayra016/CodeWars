def nickname_generator(name):
    if len(name) <= 3:
        return 'Error: Name too short'
    
    if name[2] in ('a', 'e', 'i', 'o', 'u'):
        return name[0:4]
    return name[0:3]
