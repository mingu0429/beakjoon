class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] arrStr = s.split(" ");
        
        for(int i = 0; i < arrStr.length; i++){
            if(arrStr[i].equals("Z")){
                answer -= Integer.parseInt(arrStr[i - 1]);
            }else{
                answer += Integer.parseInt(arrStr[i]);
            }
        }
        return answer;
    }
}