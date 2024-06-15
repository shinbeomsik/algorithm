package 프로그래머스레벨1_2;


public class 콜라문제 {
	   
}

class Solution45 {
	 public int solution(int a, int b, int n) {
	        int answer = 0;
	        while(n>=a){
	            answer = answer + n/a *b;
	            n = n%a + (n/a) *b;
	        }
	        return answer;
	    }
}