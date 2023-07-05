function solution(babbling) {
    let count = 0;
    for (let str of babbling) {
        if (canPronounce(str)) {
            count++;
        }
    }
    return count;
}

function canPronounce(str) {
    let words = ["aya", "ye", "woo", "ma"];
    for (let word of words) {
        if (str.startsWith(word)) {
            let remaining = str.substring(word.length);
            if (remaining === "") {
                return true;
            }
            if (canPronounce(remaining)) {
                return true;
            }
        }
    }
    return false;
}
