class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        int before = s.length();
        
        while(!s.equals("1")){
            s = s.replaceAll("0", "");
            answer[1] += before - s.length();
            s = Integer.toBinaryString(s.length());
            before = s.length();
            answer[0]++;
        }
        return answer;
    }
}