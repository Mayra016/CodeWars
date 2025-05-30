def crossover(chromosome1, chromosome2, index):
    result = ["", ""]
    
    result[0] = chromosome1[0:index] + chromosome2[index:len(chromosome2)]
    result[1] = chromosome2[0:index] + chromosome1[index:len(chromosome2)]
    
    return result
