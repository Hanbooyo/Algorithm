def solution(my_string, is_suffix):
    suffix_length = len(is_suffix)
    my_string_length = len(my_string)
    
    if suffix_length > my_string_length:
        return 0
    
    for i in range(suffix_length):
        if my_string[my_string_length - suffix_length + i] != is_suffix[i]:
            return 0
    
    return 1
