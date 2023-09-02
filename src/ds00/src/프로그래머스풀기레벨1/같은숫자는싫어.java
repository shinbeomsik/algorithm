
package 프로그래머스풀기레벨1;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		Solution22 sol = new Solution22();
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };

		int[] answer = sol.solution(arr);
		System.out.println(answer);

	}
}

class Solution22 {

	public int[] solution(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				count++;
			}
		}
		int index = 1;
		int[] answer = new int[count + 1];
		answer[0] = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				answer[index] = arr[i + 1];
				index++;
			}
		}

		return answer;
	}
}