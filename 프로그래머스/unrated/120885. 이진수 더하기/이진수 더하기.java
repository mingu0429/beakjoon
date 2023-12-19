class Solution {
    public String solution(String bin1, String bin2) {
        int dem1 = Integer.parseInt(bin1, 2);
        int dem2 = Integer.parseInt(bin2, 2);
        
        int sum = dem1 + dem2;        
        String answer = Integer.toBinaryString(sum);
        
        return answer;
    }
}