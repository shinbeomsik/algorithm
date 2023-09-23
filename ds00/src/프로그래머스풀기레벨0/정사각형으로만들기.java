package 프로그래머스풀기레벨0;

public class 정사각형으로만들기 {

	public static void main(String[] args) {
		Solution137 sol = new Solution137();
		int[][] arr = { { 572, 22, 37 }, { 287, 726, 384 }, { 85, 137, 292 }, { 487, 13, 876 } };

		int[][] answer = sol.solution(arr);
		System.out.println(answer);

	}
}

class Solution137 {
	public int[][] solution(int[][] arr) {
		int[][] answer = {};
		if (arr.length > arr[0].length) {
			answer = new int[arr.length][arr.length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					answer[i][j] = arr[i][j];
				}
			}
		} else if(arr.length < arr[0].length) {
			answer = new int[arr[0].length][arr[0].length];
			for(int i=0; i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					answer[i][j] = arr[i][j];
				}
			}
		}else {
			answer = new int[arr.length][arr[0].length];
			for(int i=0; i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					answer[i][j] = arr[i][j];
				}
			}
		}

		return answer;
	}
}