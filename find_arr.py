from collections import Counter

def find_arr(arrA, arrB, rng, wanted):
    nums = []
    a = Counter(arrA)
    b = Counter(arrB)
    
    for num in a:
        if a[num] >= 2 and b[num] >= 2 and num >= rng[0] and num <= rng[1] and num not in nums:
            if (wanted == "odd" and num % 2 != 0) or (wanted == "even" and num % 2 == 0):
                nums.append(num)
            
    return sorted(nums)
