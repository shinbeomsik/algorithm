package 프로그래머스레벨1_반복3;


public class 콜라츠추측 {
	   
}

class Solution31 {
	 public int solution(int num) {
	        int answer = 0;
	        int n=0;
	        if(num ==1){
	            return answer;
	        }
	        while(n != 501){
	            if(num % 2==0){
	                num = num/2;
	            }else if(num % 2==1){
	                num = num*3 +1;
	            } 
	            answer++;
	            n++;
	            if(num ==1){
	                break;
	            }
	        }
	        if(n == 501){
	            answer = -1;
	        }
	        return answer;
	    }
}