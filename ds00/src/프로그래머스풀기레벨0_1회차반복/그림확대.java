package 프로그래머스풀기레벨0_1회차반복;

public class 그림확대 {

	public static void main(String[] args) {
		Solution181 sol = new Solution181();
		String[] picture = {}; 
		int k = 1;

		String[] answer = sol.solution(picture, k);
		System.out.println(answer);

	}
}

class Solution181 {
	public String[] solution(String[] picture, int k) {
		String[] answer = new String[picture.length * k];
		int count = 0;
		for (int i = 0; i < picture.length; i++) {
			String t = "";
			String[] arr = picture[i].split("");
			int z = 0;
			for (int j = 0; j < arr.length; j++) {
				for (int q = 0; q < k; q++) {
					t = t + arr[j];
				}
			}

			while (z != k) {
				answer[count] = t;
				count++;
				z++;
			}

		}
		return answer;
	}
}