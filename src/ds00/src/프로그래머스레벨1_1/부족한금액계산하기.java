package 프로그래머스레벨1_반복;


public class 부족한금액계산하기 {
}

class Solution25 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        
        for(int i=1;i<=count;i++){
            sum = sum + price*i;
        }
        if(sum > money){
            answer = sum-money;
        }
        
        return answer;
    }
}