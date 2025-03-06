def solution(n):
    answer = 0
    num_str = str(n)
    num_list = []

    for i in range(len(num_str)):
        num_list.append(int(num_str[i]))

    for i in range(len(num_list)):
        answer += num_list[i]

    return answer