def solution(l, r):
    answer = []

    for i in range(l, r + 1):
        num_str = str(i)
        if all(c in '05' for c in num_str):
            answer.append(i)

    if not answer:
        return [-1]

    return answer