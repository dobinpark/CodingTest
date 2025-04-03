def solution(n):
    answer = 0
    result = 0

    for i in range(1, n):
        result = i * i
        if result == n:
            answer = 1
        elif result < n:
            answer = 2
        else:
            continue

    return answer