class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int gap;
        if(common[common.length-1]-common[common.length-2] == common[common.length-2]-common[common.length-3]){
            gap=common[common.length-1]-common[common.length-2];
            answer=common[common.length-1]+gap;
        }else {
            gap=common[common.length-1]/common[common.length-2];
            answer=common[common.length-1]*gap;
        }
        return answer;
    }
}