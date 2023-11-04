class Solution {
    public int solution(String binomial) {
        String[] arrStr = binomial.split(" ");
        
        if(arrStr[1].equals("+")){
            return Integer.parseInt(arrStr[0]) + Integer.parseInt(arrStr[2]);
        }else if(arrStr[1].equals("-")){
            return Integer.parseInt(arrStr[0]) - Integer.parseInt(arrStr[2]);
        }else{
            return Integer.parseInt(arrStr[0]) * Integer.parseInt(arrStr[2]);
            
        }
    }
}