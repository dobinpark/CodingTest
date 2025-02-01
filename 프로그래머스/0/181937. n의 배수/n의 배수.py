def solution(num, n):
    answer = 0

    if num % n == 0:
        answer = 1
    elif num % n == 1:
        answer = 0

    return answer