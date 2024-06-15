package 프로그래머스레벨1_반복3;


public class 푸드파이트대회 {
	   
}

class Solution39 {
	public String solution(int[] food) {
        String answer = "";
        
        for(int i=1;i<food.length;i++){
            int k = food[i]/2;
            for(int j=0;j<k;j++){
                answer = answer + i;
            }
        }
        answer = answer+ "0";
        
        for(int i=food.length-1;i>0;i--){
            int k = food[i]/2;
            for(int j=0;j<k;j++){
                answer = answer + i;
            }
        }
        
        return answer;
    }
}