class Solution {
    public int solution(int[] common) {
        int idx;
        int answer = 0;
        
        if((common[1] - common[0]) == (common[2] - common[1])){// 등차수열이라면
            idx = common[1] - common[0];
            answer = common[common.length - 1] + idx;
        }else{
            idx = common[1] / common[0];
            answer = common[common.length - 1] * idx;
        }
        
        return answer;
    }
}