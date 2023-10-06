package 프로그래머스풀기레벨0_1회차반복;

public class 배열자르기 {

	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] numbers = {};
		int num1 =1;
		int num2 =1;

		int[] answer = sol.solution(numbers, num1, num2);
		System.out.println(answer);

	}
}

class Solution23 {
	 public int[] solution(int[] numbers, int num1, int num2) {
	        int[] answer = new int[num2-num1+1];
	        int count = num1;
	        for(int i = 0;i<answer.length;i++){
	            answer[i] = numbers[count];
	            count++;
	        }
	        return answer;
	    }
}