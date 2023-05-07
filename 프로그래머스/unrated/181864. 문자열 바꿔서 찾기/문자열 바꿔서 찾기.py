def solution(myString, pat):
    A = list(myString)
    for i in range(len(A)):
        if A[i] == "A":
            A[i] = "B"
        else:
            A[i] = "A"
    return 1 if pat in ''.join(A) else 0