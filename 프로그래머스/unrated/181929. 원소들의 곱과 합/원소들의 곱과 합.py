def solution(num_list):
    s = sum(num_list);
    m = 1;
    for i  in num_list:
        m *= i
    return  1 if s**2 > m else 0