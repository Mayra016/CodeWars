def mine_location(field):
    for line in range(0, len(field[0])):
        for column in range(0, len(field)):
            if field[line][column] == 1:
                return [line, column]
