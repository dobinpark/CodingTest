def solution(a, b):
    answer = 0

    ab = str(a) + str(b)
    ba = 2 * a * b

    if int(ab) > int(ba):
        answer = int(ab)
    elif int(ba) > int(ab):
        answer = int(ba)
    elif int(ab) == int(ba):
        answer = int(ab)

    return answer