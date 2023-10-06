package 프로그래머스풀기레벨0_1회차반복;

public class 각도기 {

	public static void main(String[] args) {
		Solution10 sol = new Solution10();
		int angle = 70;

		int answer = sol.solution(angle);
		System.out.println(answer);

	}
}

class Solution10 {
	 public int solution(int angle) {
	        int answer = 4;
	        if(0<angle && angle < 90){
	            answer = 1;
	        }else if(angle == 90){
	            answer = 2;
	        }else if(90<angle && angle<180){
	            answer = 3;
	        }
	        return answer;
	    }
}