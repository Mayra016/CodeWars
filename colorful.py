def colorful(number):
    nums = []
    
    for num in str(number):
        if num == 0:
            return False
        if int(num) not in nums:
            nums.append(int(num))
        else:
            return False
        
    for i in range(0,len(nums) - 1):
        if nums[i] * nums[i+1] not in nums:
            nums.append(nums[i] * nums[i+1])
        else:
            return False
    
    return True
