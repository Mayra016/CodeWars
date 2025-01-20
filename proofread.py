def proofread(st):
    isFirstLetter = True;
    st = st.lower()
    sentences = st.split(". ");
    result = "";
    
    for sentence in sentences:
        if "ie" in sentence:
            sentence = sentence.replace("ie", "ei");
            
        sentence = sentence.capitalize();
        result = result + sentence + ". ";
        
        
    result = result.strip();
    
    if ".." in result:
        result = result.replace("..", ".");
    
    return result if len(st) > 1 and st[len(st) - 1] == "." else result[0:len(result) - 1]; 
