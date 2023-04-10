class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int checker = 0;
        for (int j = 0; j < dic.length; j++) {
            for (int i = 0; i < spell.length; i++) {
                if (dic[j].contains(spell[i])) { // contains 메소드 호출 방법 수정
                    checker++;
                }
            }
            if (checker == spell.length) {
                answer = 1;
                break; // 더 이상 반복할 필요가 없으므로 break문 추가
            }
            checker = 0; // 다음 dic[j]를 검사하기 위해 checker 변수 초기화
        }
        return answer;
    }
}
