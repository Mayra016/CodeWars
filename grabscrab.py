def grabscrab(said, possible_words):
    result = []
    
    for word in possible_words:
        if len(word) == len(said):
            current = word
            for letter in said:
                current = current.replace(letter, "", 1)
            if current == "":
                result.append(word)
            
    return result
