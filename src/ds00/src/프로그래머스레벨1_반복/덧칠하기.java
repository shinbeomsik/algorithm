package 프로그래머스레벨1_반복;

public class 덧칠하기 {

}

class Solution53 {
	public int solution(int n, int m, int[] section) {
		int answer = 0;
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
		for (int i = 0; i < section.length; i++) {
			arr[section[i] - 1]--;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0 && i + m <= arr.length) {
				for (int k = i; k < i + m; k++) {
					arr[k]++;
				}
				i = i + m - 1;
				answer++;
			} else if (arr[i] == 0 && i + m > arr.length) {
				for (int k = i; k < arr.length; k++) {
					arr[k]++;
				}
				answer++;
				break;
			}
		}

		return answer;
	}
}