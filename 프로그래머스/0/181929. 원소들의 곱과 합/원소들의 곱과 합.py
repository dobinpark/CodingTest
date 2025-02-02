def solution(num_list):
    answer = 0

    num1 = 1
    num2 = 0

    for num in num_list:
        num1 *= num

    for num in num_list:
        num2 += num

    num2 = num2 ** 2

    if num1 < num2:
        answer = 1
    else:
        answer = 0

    return answer