class Solution {
    public int solution(int num) {
        
        int idx = 0;
        long n = (long)num;
        
        while(n != 1){
            if(n % 2 == 0){
                n = n / 2;
                idx++;
            }else{
                n = n * 3 + 1;
                idx++;
            }
        }
        if(idx >= 500){
            return -1;
        }
        return idx;
    }
}