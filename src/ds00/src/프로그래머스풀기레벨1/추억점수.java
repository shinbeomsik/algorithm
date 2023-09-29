
package 프로그래머스풀기레벨1;

import java.util.*;

public class 추억점수 {

	public static void main(String[] args) {
		Solution39 sol = new Solution39();
		String[] name = { "kali", "mari", "don"};
		int[] yearning = { 11, 1, 55};
		String[][] photo = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};

		int[] answer = sol.solution(name, yearning, photo);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution39 {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo[i].length; j++) {
				for (int k = 0; k < name.length; k++) {
					if (photo[i][j].equals(name[k])) {
						answer[i] = answer[i] + yearning[k];
					}
				}
			}
		}

		return answer;
	}
}