def check_three_and_two(array):
    array.sort()
    times = 1
    y = 0
    nums = [0,0,0]
    
    for i in range(1, len(array)):
        if array[i] == array[i - 1]:
            times = times + 1
        else:
            times = 1
            y = y + 1
        
        nums[y] = times
        
    nums.sort(reverse = True)

    if nums[0] == 3 and nums[1] == 2:
        return True
    else:
        return False
