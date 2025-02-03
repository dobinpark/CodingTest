def solution(num_list):
    answer = []

    num1 = num_list[-2]
    num2 = num_list[-1]

    if num1 < num2:
        num_list.append(num2 - num1)
    else:
        num_list.append(num2 * 2)

    answer = num_list

    return answer