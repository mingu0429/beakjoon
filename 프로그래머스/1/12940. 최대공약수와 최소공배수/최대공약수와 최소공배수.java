class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcdlcm(n, m);
        answer[1] = (n * m) / answer[0];        
        return answer;
    }
    
    public static int gcdlcm(int c, int d){
        if(d == 0){
            return c;
        }
        return gcdlcm(d, c % d);
    }
}