def solution(num_list):
    answer = 0

    a = ""
    b = ""

    for strNum in num_list:
        if strNum % 2 == 1:
            a += str(strNum)
        elif strNum % 2 == 0:
            b += str(strNum)

    answer = int(a) + int(b)

    return answer