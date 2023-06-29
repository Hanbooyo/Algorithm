function solution(array) {
    let answer = 0;
    let index = new Array(1001).fill(0);

    for (let i = 0; i < array.length; i++) {
        index[array[i]]++;
    }

    let max = 0;
    let max_index = 0;

    for (let i = 0; i < index.length; i++) {
        if (index[i] > max) {
            max = index[i];
            max_index = i;
        }
    }

    let count = 0;
    for (let i = 0; i < index.length; i++) {
        if (index[i] === max) {
            count++;
        }
    }

    answer = max_index;

    if (count > 1) {
        answer = -1;
    }

    return answer;
}
