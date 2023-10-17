package 프로그래머스풀기레벨1_1회차반복;

public class 소수찾기_에리스토리늬체알아두기 {

	public static void main(String[] args) {
		Solution50 sol = new Solution50();
		int n = 70;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

//에라토스테네스의 체 (소수 구하는 알고리즘 알아두기);
class Solution50 {
	public int solution(int n) {
		int answer = 0;

		boolean[] arr = new boolean[n + 1];
		arr[0] = arr[1] = false;
		for (int i = 2; i <= n; i += 1) {
			arr[i] = true;
		}

		for (int i = 2; i * i <= n; i += 1) {
			for (int j = i * i; j <= n; j += i) {
				arr[j] = false;
			}
		}
		for (int i = 0; i <= n; i += 1) {
			if (true == arr[i]) {
				answer++;
			}
		}
		return answer;
	}
}