class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++){
            
            Character word = code.charAt(i);
            
            if(mode == 0){
                if(word != '1'){
                    if(i % 2 == 0){
                        ret = ret + word;
                    }
                } else{
                    mode = 1;
                }
                
            } else{
                if(word != '1'){
                    if(i % 2 == 1){
                        ret = ret + word;
                    }
                } else{
                    mode =  0;
                }
            }
        }
        return ret.equals("") ? "EMPTY" : ret;
    }
}