def solution(my_string):
    answer = []
    
    vowels = ['a', 'e', 'i', 'o', 'u']
    
    for char in my_string:
        if char not in vowels: # 모음이 아니면 answer에 추가
            answer.append(char)
            
    return ''.join(answer) # 리스트를 문자열로 변환
