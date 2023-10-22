package 프로그래머스풀기레벨0_1회차반복;



public class 영어가싫어요 {

	public static void main(String[] args) {
		Solution173 sol = new Solution173();
		String numbers = "";

		long answer = sol.solution(numbers);
		System.out.println(answer);

	}
}

class Solution173 {
	 public long solution(String numbers) {
	        long answer = 0;
	        numbers = numbers.replaceAll("zero","0")
	            .replaceAll("one","1")
	            .replaceAll("two","2")
	            .replaceAll("three","3")
	            .replaceAll("four","4")
	            .replaceAll("five","5")
	            .replaceAll("six","6")
	            .replaceAll("seven","7")
	            .replaceAll("eight","8")
	            .replaceAll("nine","9");

	            
	        answer = Long.parseLong(numbers);
	        return answer;
	    }
}