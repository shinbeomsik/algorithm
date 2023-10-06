package 프로그래머스풀기레벨0_1회차반복;

public class 배열두배만들기 {

	public static void main(String[] args) {
		Solution19 sol = new Solution19();
		int[] numbers = {1, 2, 3, 4, 5};

		int[] answer = sol.solution(numbers);
		System.out.println(answer);

	}
}

class Solution19 {
	  public int[] solution(int[] numbers) {
	        int[] answer = new int[numbers.length];
	            
	        for(int i=0;i<numbers.length;i++){
	            answer[i] = numbers[i]*2;
	        }
	        
	        return answer;
	    }
}