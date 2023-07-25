class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letterList = letter.split(" ");
        
        for(String l : letterList){
            for(int i = 0; i < morse.length; i++){
                if(l.equals(morse[i])){
                    answer += Character.toString(i + 97);
                }
            }
        }
        return answer;
    }
}