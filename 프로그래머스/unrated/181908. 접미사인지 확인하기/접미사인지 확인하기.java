class Solution {
    public int solution(String my_string, String is_suffix) {
        int ml = my_string.length();
        int il = is_suffix.length();
        
        if(ml < il){
            return 0;
        } else if(ml == il){
            if(my_string.equals(is_suffix)){
                return 1;
            } return 0;
        } else{
            if(my_string.substring(ml - il).equals(is_suffix)){
                return 1;
            }return 0;
        }
    }
}