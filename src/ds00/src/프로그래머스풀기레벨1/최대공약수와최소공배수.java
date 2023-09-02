
package 프로그래머스풀기레벨1;

public class 최대공약수와최소공배수 {

	public static void main(String[] args) {
		Solution21 sol = new Solution21();
		int n = 3;
		int m = 12;

		long[] answer = sol.solution(n, m);
		System.out.println(answer);

	}
}

class Solution21 {
	public long[] solution(int n, int m) {
		long[] answer = new long[2];

		if (m % n == 0) {
			answer[0] = n;
			answer[1] = m;
		} else {
			for (int i = 1; i < m; i++) {
				if (n % i == 0 && m % i == 0) {
					answer[0] = i;
				}
			}
			answer[1] = n * m / answer[0];
		}
		return answer;
	}
}