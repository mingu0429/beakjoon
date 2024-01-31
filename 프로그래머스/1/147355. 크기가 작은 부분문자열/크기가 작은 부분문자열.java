class Solution {
    public int solution(String t, String p) {
        
        int cnt = 0;
        int l = p.length();
        long pNum = Long.parseLong(p);
        long temp = 0;
        
        for(int i = 0; i < t.length() - l + 1; i++){
            temp = Long.parseLong(t.substring(i, i + l));
            if(temp <= pNum){
                cnt++;                
            }
        }
        
        return cnt;
    }
}