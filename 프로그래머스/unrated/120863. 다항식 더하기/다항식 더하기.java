class Solution {
    public String solution(String polynomial) {
        
        String answer = "";
        int x = 0;
        int num = 0;
        
        for(String s : polynomial.split(" \\+ ")){
            if(s.equals("x")){
                x++;                
            }else if(s.contains("x")){
                s = s.replace("x","");
                x += Integer.parseInt(s);
            }else{
                num += Integer.parseInt(s);
            }
        }
        if((x > 0) && (num > 0)){
            if(x == 1){
                answer = "x + " + Integer.toString(num);
            }else{
                answer = Integer.toString(x) + "x + " + Integer.toString(num);
            }
        }else if((x > 0) && (num == 0)){
            if(x == 1){
                answer = "x";
            }else{
                answer = Integer.toString(x) + "x";
            }
        }else{
            answer = Integer.toString(num);
        }
        
        return answer;
    }
}