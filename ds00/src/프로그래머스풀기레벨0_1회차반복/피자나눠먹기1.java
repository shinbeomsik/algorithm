package 프로그래머스풀기레벨0_1회차반복;

public class 피자나눠먹기1 {

	public static void main(String[] args) {
		Solution21 sol = new Solution21();
		int n = 70;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution21 {
	 public int solution(int n) {
	        int answer = 0;
	        
	        if(n%7 ==0){
	            answer = n/7;
	        }else {
	            answer = n/7 +1;
	        }
	        
	        return answer;
	    }
}