package 프로그래머스레벨1_4;


public class 푸드파이트대회 {
	   
}

class Solution44 {
	public String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length;i++){
            for(int j=0; j<food[i]/2; j++){
                answer = answer + i;
            }
        }
        answer = answer + 0;
        
        for(int i=answer.length()-2; i>=0; i--){
            answer = answer + answer.charAt(i);
        }
        return answer;
    }
}