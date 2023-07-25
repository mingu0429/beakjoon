class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] rspList = rsp.split("");
        
        for(String s : rspList){
            if(s.equals("2")){
                answer += "0";
            }else if(s.equals("5")){
                answer += "2";
            }else{
                answer += "5";
            }
        }
        
        return answer;
    }
}