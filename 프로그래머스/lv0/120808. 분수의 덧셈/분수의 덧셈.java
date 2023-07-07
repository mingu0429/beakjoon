class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
                
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        
        for(int i = denom; i > 0; i--){
            if((numer % i == 0) && (denom % i == 0)){
                numer = numer / i;
                denom = denom / i;
            }
        }
        
        int[] answer = {numer, denom};
            
        return answer;
    }
}