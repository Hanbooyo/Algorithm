def solution(num_list):
    if len(num_list)<=10:
        a = 1
        for i in num_list:
            a = a*i
        return a
    return sum(num_list)