vowels = ['a', 'e', 'i', 'o', 'u']

def encode(st):
    for i in range(1, len(vowels) + 1):
        st = st.replace(vowels[i - 1], str(i))
    return st
    
def decode(st):  
    for i in range(1, len(vowels) + 1):
        st = st.replace(str(i), vowels[i - 1])
    return st
