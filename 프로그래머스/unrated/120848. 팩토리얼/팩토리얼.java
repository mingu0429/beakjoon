class Solution {
    public int solution(int n) {
        
        int num = 1;
        int idx = 1;
        
        while(true){
            num *= idx;
            
            if(num > n){
                idx--;
                break;
            }
            idx++;
        }
        return idx;
    }
}