def solution(price, money, count):
    hap = 0
    for i in range(1,count+1,1):
        hap += price*i
    if(hap<=money):
        return 0
    else:
        return hap-money