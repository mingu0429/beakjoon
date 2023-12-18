class Solution {
    public int solution(int chicken) {
        int service = 0;
        
        while(chicken >= 10){
            chicken = chicken - 10;
            chicken += 1;
            service++;
        }
        return service;
    }
}