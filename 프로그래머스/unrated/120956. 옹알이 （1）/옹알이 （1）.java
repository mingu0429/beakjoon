class Solution {
    public int solution(String[] babbling) {
        
        int cnt = 0;
        for(int i = 0; i < babbling.length; i++){
            babbling[i] = babbling[i].replaceAll("ye", " ");
            babbling[i] = babbling[i].replaceAll("aya", " ");
            babbling[i] = babbling[i].replaceAll("woo", " ");
            babbling[i] = babbling[i].replaceAll("ma", " ");
            babbling[i] = babbling[i].replaceAll(" ", "");

            if(babbling[i].equals("")){
                cnt++;
            }
        }
        return cnt;
    }
}