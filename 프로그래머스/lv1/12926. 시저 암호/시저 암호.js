
function solution(s, n) {
    var answer = '';
    for (let i = 0; i < s.length; i++) {
    let charCode = s.charCodeAt(i);
    if (charCode >= 65 && charCode <= 90) {
    // 대문자인 경우
    answer += String.fromCharCode(((charCode - 65 + n) % 26) + 65);
    } else if (charCode >= 97 && charCode <= 122) {
    // 소문자인 경우
    answer += String.fromCharCode(((charCode - 97 + n) % 26) + 97);
    } else {
    // 공백인 경우
    answer += ' ';
    }
    }
    return answer;
}