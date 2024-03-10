class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toBinaryString(n);
        int cnt = Integer.bitCount(n);
        
        while(true){
            n++;
            if(cnt == Integer.bitCount(n)){
                answer = n;
                break;
            }
        }
        return answer;
    }
}