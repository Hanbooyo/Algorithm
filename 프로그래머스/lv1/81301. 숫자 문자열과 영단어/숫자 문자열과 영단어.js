function solution(s) {
    //replace용 문자배열 선언
    let strnum = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
    
    //반복문, replace
    for(let i =0; i<=strnum.length-1; i++) {
        s=s.replaceAll(strnum[i],i);
    }
    
    //정수형 변환
    return parseInt(s);
}