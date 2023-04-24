def solution(a, b):
    if (a+b)%2 != 0:
        return 2*(a+b)
    elif a%2 ==1 and b%2 ==1:
        return a**2+b**2
    else:
        return abs(a-b)