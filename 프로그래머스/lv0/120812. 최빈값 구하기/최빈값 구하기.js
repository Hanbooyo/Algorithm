function solution(array) {
    let answer = 0;
    let index = new Array(1001).fill(0); // 1001 크기의 배열 생성 및 0으로 초기화

    for (let i = 0; i < array.length; i++) {
        index[array[i]]++; // 배열의 값에 해당하는 인덱스의 값을 증가시킴
    }

    let max = 0;
    let max_index = 0;

    for (let i = 0; i < index.length; i++) {
        if (index[i] > max) { // 가장 큰 값과 그에 해당하는 인덱스를 찾음
            max = index[i];
            max_index = i;
        }
    }

    let count = 0;
    for (let i = 0; i < index.length; i++) {
        if (index[i] === max) { // 최대값과 같은 값을 가지는 요소의 개수를 세어줌
            count++;
        }
    }

    answer = max_index; // 결과값을 가장 큰 값의 인덱스로 설정

    if (count > 1) {
        answer = -1; // 최대값과 같은 값을 가지는 요소가 여러 개일 경우 -1로 설정
    }

    return answer; // 결과값 반환
}
