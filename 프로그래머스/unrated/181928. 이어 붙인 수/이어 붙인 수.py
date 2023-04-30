def solution(num_list):
    odds = "";
    evens = "";
    for i in num_list:
        if i%2 ==0:
            evens += str(i)
        else:
            odds += str(i)
    return int(odds)+int(evens)