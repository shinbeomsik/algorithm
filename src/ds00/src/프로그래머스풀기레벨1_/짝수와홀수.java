package 프로그래머스풀기레벨1_;



public class 짝수와홀수 {

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		int num = 70;

		String answer = sol.solution(num);
		System.out.println(answer);

	} 
}

class Solution1 {
	  public String solution(int num) {
	        String answer = "";
	        if(num%2 ==0){
	            answer ="Even";
	        }else{
	            answer =  "Odd";
	        }
	        return answer;
	    }
}