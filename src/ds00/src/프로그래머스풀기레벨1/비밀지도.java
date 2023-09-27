
package 프로그래머스풀기레벨1;

import java.util.Arrays;

public class 비밀지도 {

	public static void main(String[] args) {
		Solution32 sol = new Solution32();
		int n = 6;
		int[] arr1 = { 46, 33, 33, 22, 31, 50 };
		int[] arr2 = { 27, 56, 19, 14, 14, 10 };

		String[] answer = sol.solution(n, arr1, arr2);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution32 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			// 두 배열을 이진수로 변환하고 길이를 맞춥니다.
			String binary1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
			String binary2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
			// "%"+n+"s"는 포맷 문자열로, %s 지정자를 사용하면서 n 길이만큼의 문자열 공간을 확보하도록 지정.
			// 두 이진수를 합치고 '#'과 ' '로 변환합니다.
			StringBuilder result = new StringBuilder();
			for (int j = 0; j < n; j++) {
				char char1 = binary1.charAt(j);
				char char2 = binary2.charAt(j);
				if (char1 == '1' || char2 == '1') {
					result.append('#');
				} else {
					result.append(' ');
				}
			}

			answer[i] = result.toString();
		}

		return answer;
	}
}