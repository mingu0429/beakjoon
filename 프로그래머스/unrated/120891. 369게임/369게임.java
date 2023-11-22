class Solution {
    public int solution(int order) {
        
        int cnt = 0;
        
        String strOrder = Integer.toString(order);
        
        for(int i = 0; i < strOrder.length(); i++){
            if((strOrder.charAt(i) == '3') || (strOrder.charAt(i) == '6') || (strOrder.charAt(i) == '9')){
                cnt++;
            }
        }
        
        return cnt;
    }
}