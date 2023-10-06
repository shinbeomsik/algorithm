package 프로그래머스풀기레벨1;

public class 다트게임 {

	public static void main(String[] args) {
		Solution51 sol = new Solution51();
		String dartResult = "1D2S3T*";

		System.out.println(1 * 2 + 2 * 2 + (3 * 3 * 3) * 2);
		int answer = sol.solution(dartResult);
		System.out.println(answer);

	}
}

class Solution51 {
	public int solution(String dartResult) {
		int answer = 0;
		double result = 0;
		String[] arr = dartResult.split("");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].matches("[0-9]")) {
				if (arr[i + 1].equals("S")) {
					if (i + 2 < arr.length && arr[i + 2].equals("#")) {
						result = result - Math.pow(Double.parseDouble(arr[i]), 1);
					} else {
						result = result + Math.pow(Double.parseDouble(arr[i]), 1);
					}
				} else if (arr[i + 1].equals("D")) {
					if (i + 2 < arr.length && arr[i + 2].equals("#")) {
						result = result - Math.pow(Double.parseDouble(arr[i]), 2);
					} else {
						result = result + Math.pow(Double.parseDouble(arr[i]), 2);
					}
				} else if (arr[i + 1].equals("T")) {
					if (i + 2 < arr.length && arr[i + 2].equals("#")) {
						result = result - Math.pow(Double.parseDouble(arr[i]), 3);
					} else {
						result = result + Math.pow(Double.parseDouble(arr[i]), 3);
					}
				}

				if (i + 2 < arr.length && arr[i + 2].equals("*")) {
					result = result * 2;
				}
			}

			if (arr[i].equals("1") && arr[i + 1].equals("0")) {
				String k = arr[i] + arr[i + 1];
				if (arr[i + 2].equals("S")) {
					if (i + 3 < arr.length && arr[i + 3].equals("#")) {
						result = result - Math.pow(Double.parseDouble(k), 1);
					} else {
						result = result + Math.pow(Double.parseDouble(k), 1);
					}
				} else if (arr[i + 2].equals("D")) {
					if (i + 3 < arr.length && arr[i + 3].equals("#")) {
						result = result - Math.pow(Double.parseDouble(k), 2);
					} else {
						result = result + Math.pow(Double.parseDouble(k), 2);
					}
				} else if (arr[i + 2].equals("T")) {
					if (i + 3 < arr.length && arr[i + 3].equals("#")) {
						result = result - Math.pow(Double.parseDouble(k), 3);
					} else {
						result = result + Math.pow(Double.parseDouble(k), 3);
					}
				}

				if (i + 3 < arr.length && arr[i + 3].equals("*")) {
					result = result * 2;
				}
			}
		}

		answer = (int) result;
		return answer;
	}
}