package 프로그래머스레벨1_반복;

public class 소수만들기 {

}

class Solution57 {
	public int solution(int[] nums) {
		int answer = 0;

		int[] kre = new int[3001];
		kre[0] = -1;
		kre[1] = 1;

		for (int i = 2; i * i <= 3001; i += 1) {
			for (int j = i * i; j <= 3001; j += i) {
				kre[j] = 1;
			}
		}
		int qqq = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					qqq = nums[i] + nums[j] + nums[k];
					if (kre[qqq] == 0) {
						answer++;
					}

				}
			}
		}

		return answer;
	}
}
