package 프로그래머스레벨1_반복;


public class 소수찾기_에리토스테네스의체찾아 {
	
}

class Solution56 {
    public int solution(int n) {
        int answer = 0;
        int[] k = new int[n+1];
        k[0] = 1;
        k[1] = 1;
        
		for (int i = 2; i * i <= n; i += 1) {
			for (int j = i * i; j <= n; j += i) {
				k[j] = 1;
			}
		}
        
            for (int i = 0; i <= n; i += 1) {
			if (0 == k[i]) {
				answer++;
			}
		}
        return answer;
    }
}