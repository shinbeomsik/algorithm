package 프로그래머스레벨1_2;


public class 푸드파이터대회 {
	   
}

class Solution42 {
	 public String solution(int[] food) {
	        String answer = "";
	        for(int i=1;i<food.length;i++){
	            if(food[i]/2>0){
	                for(int j=0;j<food[i]/2;j++){
	                    answer = answer + i;
	                }
	            }
	        }
	        StringBuilder krr = new StringBuilder(answer);
	        krr.reverse();
	        answer = answer + "0" + krr;
	        return answer;
	    }
}