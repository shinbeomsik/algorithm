package 프로그래머스레벨1_1;

public class 비밀지도1차 {
}

class Solution36 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < arr1.length; i++) {
			String k1 = Integer.toBinaryString(arr1[i]);
			while (k1.length() < n) {
				k1 = "0" + k1;
			}
			String k2 = Integer.toBinaryString(arr2[i]);
			while (k2.length() < n) {
				k2 = "0" + k2;
			}
			long sum = 0;
			sum = Long.parseLong(k1) + Long.parseLong(k2);

			String k3 = Long.toString(sum);
			while (k3.length() < n) {
				k3 = "0" + k3;
			}

			k3 = k3.replaceAll("1", "#").replaceAll("2", "#").replaceAll("0", " ");

			answer[i] = k3;
		}

		return answer;
	}
}