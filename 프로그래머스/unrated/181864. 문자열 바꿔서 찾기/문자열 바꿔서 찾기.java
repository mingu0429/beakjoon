class Solution {
    public int solution(String myString, String pat) {
        String reverse = "";
        
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'A'){
                reverse += "B";
            }else{
                reverse += "A";
            }
        }
        
        return reverse.contains(pat) ? 1 : 0;
    }
}