package 프로그래머스레벨1_2;


public class 부족한금액계산하기 {
	   
}

class Solution26 {
	public long solution(int price, int money, int count) {
        long answer = 0;
        long totalpr =0;
        for(int i=1;i<=count;i++){
            totalpr = totalpr + price*i;
        }
        
        if(money < totalpr){
            answer = totalpr-money;
        }
        return answer;
    }
}