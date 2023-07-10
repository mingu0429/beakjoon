class Solution {
    public int solution(int a, int b) {
        
        int ab = Integer.parseInt("" + a + b);
        int cal = 2 * a * b;
        
        return ab >= cal ? ab : cal;
    }
}