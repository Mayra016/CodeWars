def kill_count(counselors, jason):
    killed = []
    
    for person in counselors:
        if person[1] < jason:
            killed.append(person[0])
    
    return killed
