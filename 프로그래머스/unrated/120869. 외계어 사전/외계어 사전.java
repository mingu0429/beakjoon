import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        
        int answer = 2;
        int cnt = 0;
        
        for(String s : dic){
            cnt = 0;
            if(spell.length == s.length()){
                for(int i = 0; i < spell.length; i++){
                    if(s.contains(spell[i])){
                        cnt++;
                    }else{
                        break;
                    }
                }
                if(cnt == spell.length){
                    answer = 1;
                }
            }
        }
        return answer;
    }
}