package 프로그래머스레벨1_반복4;


public class 부족한금액계산하기 {
	   
}

class Solution25 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long total = 0;
        for(int i=1;i<=count;i++){
            total = total + price*i;
        }
        
        if(money > total){
            answer = 0;
        }else{
            answer = total - money;
        }
        
        return answer;
    }
}