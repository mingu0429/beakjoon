import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
        Map<String, String> map = new HashMap<String, String>();
        String answer = "fail";
        
        for(String[] s : db){
            map.put(s[0], s[1]);
        }
        
        if(map.containsKey(id_pw[0])){
            if(map.get(id_pw[0]).equals(id_pw[1])){
                answer = "login";
            }else{
                answer = "wrong pw";
            }
        }
        
        return answer;
    }
}