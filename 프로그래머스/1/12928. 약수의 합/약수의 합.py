def solution(n):
    answer = 0
    sort = []

    for i in range(1, n + 1):
        if n % i == 0:
            sort.append(i)

    for i in range(len(sort)):
        answer += sort[i]

    return answer