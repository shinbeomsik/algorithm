package 프로그래머스풀기레벨1_;

public class 최대공약수와최소공배수 {

	public static void main(String[] args) {
		Solution28 sol = new Solution28();
		int n = 70;
		int m = 1;
		long[] answer = sol.solution(n, m);
		System.out.println(answer);
	}
}

class Solution28 {
	public long[] solution(int n, int m) {
		long[] answer = new long[2];

		if (m % n == 0) {
			if (n < m) {
				answer[0] = n;
				answer[1] = m;
			} else {
				answer[0] = m;
				answer[1] = n;
			}
		} else {
			if (n < m) {
				for (int i = 1; i < m; i++) {
					if (n % i == 0 && m % i == 0) {
						answer[0] = i;
					}
				}
			} else {
				for (int i = 1; i < n; i++) {
					if (n % i == 0 && m % i == 0) {
						answer[0] = i;
					}
				}
			}
			answer[1] = n * m / answer[0];
		}
		return answer;
	}
}