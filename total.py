def total(arr):
    sum = 0
    index = 0
    iterations = 0;
    max = len(arr) - 1
    
    while iterations < len(arr): 
        for i in range(0, max):
            arr[index] = arr[i] + arr[i + 1]
            index = index + 1
        max = max - 1
        iterations = iterations + 1
        index = 0
    return arr[0]
