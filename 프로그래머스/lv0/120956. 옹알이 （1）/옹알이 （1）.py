def solution(babbling):
    answer = 0
    ay = ["aya", "ye", "woo", "ma"]
    
    for i in babbling:
        temp = i
        for j in range(0,len(ay),1):
            if ay[j] in temp:
                temp = temp.replace(ay[j],"-")
        temp = temp.replace("-","")
        if temp=='':
            answer +=1
    return answer
