class Solution {
    public int solution(int hp) {
        int num = 0;
        num = hp / 5;
        hp = hp % 5;
        num += hp / 3;
        hp = hp % 3;
        num += hp / 1;
        
        return num;
    }
}