def tail_swap(strings):
    first = strings[0].split(':')
    second = strings[1].split(':')
    
    return [first[0] + ":" + second[1], second[0] + ":" + first[1]]
