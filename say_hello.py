def say_hello(name, city, state):
    result = "Hello, "
    
    for i in range(0, len(name)):
        result = result + name[i]
        if i < len(name) - 1:
            result = result + " "
        
    return result + "! Welcome to " + city + ", " + state + "!"
