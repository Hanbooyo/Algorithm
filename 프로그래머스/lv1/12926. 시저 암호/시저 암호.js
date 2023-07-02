function solution(s, n) {
    let answer = '';

    for (let i = 0; i < s.length; i++) {
        const char = s[i];
        let encryptedChar = '';

        if (char === ' ') {
            // 공백은 그대로 유지
            encryptedChar = ' ';
        } else {
            const isLowerCase = /[a-z]/.test(char);
            const startCharCode = isLowerCase ? 'a'.charCodeAt(0) : 'A'.charCodeAt(0);
            const charCode = char.charCodeAt(0);
            const shiftedCharCode = (charCode - startCharCode + n) % 26 + startCharCode;

            encryptedChar = String.fromCharCode(shiftedCharCode);
        }

        answer += encryptedChar;
    }

    return answer;
}
