package 프로그래머스풀기레벨0;


public class 영어가싫어요 {

	public static void main(String[] args) {
		Solution128 sol = new Solution128();
		String numbers = "onetwothreefourfivesixseveneightnine"	;

		long answer = sol.solution(numbers);
		System.out.println(answer);

	}
}  

class Solution128 {
	 public long solution(String numbers) {
	        long answer = 0;
	        String num = numbers
	        		.replace("zero","0")
	        		.replace("one","1")
	        		.replace("two","2")
	        		.replace("three","3")
	        		.replace("four","4")
	        		.replace("five","5")
	        		.replace("six","6")
	        		.replace("seven","7")
	        		.replace("eight","8")
	        		.replace("nine","9");
	        
	        answer = Long.parseLong(num);
	        return answer;
	    }
}