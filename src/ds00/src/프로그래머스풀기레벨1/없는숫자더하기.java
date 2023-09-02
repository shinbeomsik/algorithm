
package 프로그래머스풀기레벨1;


public class 없는숫자더하기 {

	public static void main(String[] args) {
		Solution14 sol = new Solution14();
		int[] numbers = {1,2,3,4,6,7,8,0};

		int answer = sol.solution(numbers);
		System.out.println(answer);

	}
}

class Solution14 {
	  public int solution(int[] numbers) {
	        int answer = 45;
	        int totalanswer = 0;
	        for (int i = 0; i < numbers.length; i++) {
				for (int j = 0; j < 10; j++) {
					if(numbers[i]==j) {
						totalanswer = totalanswer + numbers[i];
					}
				}
			}
	        return answer - totalanswer;
	    }
}