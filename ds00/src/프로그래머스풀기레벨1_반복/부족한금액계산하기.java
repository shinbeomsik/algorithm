package 프로그래머스풀기레벨1_반복;



public class 부족한금액계산하기 {

}

class Solution24 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum =0;
        for(int i=1;i<=count;i++){
            sum = sum + price*i;
        }
    
        answer = sum-money;
        
        if(answer <0){
            answer = 0;
        }
        return answer;
    }
}