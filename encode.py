def encode(st):
    result = ""
    st = st.lower()
    for i in range(0, len(st)):
        if st[i].isalpha():
            result = result + str(ord(st[i]) - ord('0') - 48)
        else:
            result = result + st[i]
    return result
