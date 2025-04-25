def get_section_id(scroll, sizes):
    for i in range(0, len(sizes)):
        if scroll == sizes[i]:
            return i + 1
        if i == 0 and scroll < sizes[i]:
            return i
    return -1
