package 프로그래머스풀기레벨0;

import java.util.Arrays;

public class 배열회전시키기 {

	public static void main(String[] args) {
		Solution78 sol = new Solution78();
		int[] numbers = { 1, 2, 3 };
		String direction = "right";

		int[] answer = sol.solution(numbers, direction);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution78 {
	public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("right")) {
        	answer[0] = numbers[numbers.length-1];
        	for(int i=1; i<numbers.length;i++) {
        		answer[i] = numbers[i-1];
        	}
        }else {
        	for(int i=0;i<numbers.length-1;i++) {
        		answer[i] = numbers[i+1];
        	}
        	answer[numbers.length-1] = numbers[0];
        }
        return answer;
    }
}