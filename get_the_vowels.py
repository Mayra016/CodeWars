def get_the_vowels(word): 
    vowels = ['a', 'e', 'i', 'o', 'u']
    index = 0
    count = 0
    
    for letter in word:
        if letter.lower() == vowels[index]:
            index = index + 1 if index < 4 else 0
            count = count + 1
        
    return count
