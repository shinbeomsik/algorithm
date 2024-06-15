package 프로그래머스레벨1_반복2;


public class 기사단원의무기 {
	   
}

class Solution52 {
	 public int solution(int number, int limit, int power) {
	        int answer = 0;
	        int[] yasu = new int[number+1];
	        for(int i=1;i<=number;i++){
	            for(int j=i; j<=number;j = j+i){
	                yasu[j]++;
	            }
	        }
	        
	        for(int i=1;i<yasu.length;i++){
	            if(yasu[i] <=limit){
	                answer = answer + yasu[i];
	            }else{
	                answer = answer + power;
	            }
	        }
	        return answer;
	    }
}