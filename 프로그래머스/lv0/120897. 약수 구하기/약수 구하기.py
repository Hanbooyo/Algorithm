def solution(n):
    answer = [i for i in range(1,n+1) if n%i == 0]
    return answer