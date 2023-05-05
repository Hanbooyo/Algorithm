def solution(arr, k):
    for i in range(len(arr)):
        if k%2==0:
            arr[i] = k+arr[i]
        else:
            arr[i] = k*arr[i]
    return arr