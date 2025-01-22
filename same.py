def same(arr_a, arr_b):
    if arr_a == arr_b:
        return True
    
    if len(arr_a) != len(arr_b):
        return False
    
    for i in range(0, len(arr_a)):      
        arr_a[i].sort()
        arr_b[i].sort()
        
    arr_a.sort()
    arr_b.sort()    
    
    if arr_a == arr_b:
        return True
    else: 
        return False
    
