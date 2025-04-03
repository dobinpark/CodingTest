def solution(box, n):
    
    width_count = box[0] // n
    height_count = box[1] // n
    depth_count = box[2] // n
    
    # 총 들어갈 수 있는 주사위 개수를 계산합니다.
    return width_count * height_count * depth_count
