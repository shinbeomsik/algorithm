
package 프로그래머스풀기레벨1;

import java.util.*;

public class 소수찾기 {

	public static void main(String[] args) {
		Solution48 sol = new Solution48();
		int n = 10;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}
// 에라토스테네스의 체
class Solution48 {
	public int solution(int n) {
		int answer = 0;

		List<Integer> primes = new ArrayList<>();
		boolean[] isPrime = new boolean[n + 1];

		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}

		for (int p = 2; p * p <= n; p++) {
			if (isPrime[p]) {
				for (int i = p * p; i <= n; i += p) {
					isPrime[i] = false;
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				primes.add(i);
			}
		}
		answer = primes.size();
		return answer;
	}
}

//이거도 풀리긴하는데 시간이 너무 오래걸림 효율성 테스트 통과 못하고 나머지도 시간초과로 안됨
//for (int i = 1; i <= n; i++) {
//	List<Integer> arr = new ArrayList<>();
//	for (int j = 1; j <= i; j++) {
//		if (i % j == 0) {
//			arr.add(j);
//		}
//		if(arr.size()>2) {
//			break;
//		}
//	}
//	if (arr.size() == 2) {
//		answer++;
//	}
//}