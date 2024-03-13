package 프로그래머스레벨1_반복3;


public class 부족한금액계산하기 {
	   
}

class Solution20 {
	public long solution(int price, int money, int count) {
        long answer = 0;
        
        long total = 0;
        
        for(int i=1;i<=count;i++){
            total  = total + price*i;
        }
        
        if(total > money){
            answer = total -money;
        }
        return answer;
    }
}