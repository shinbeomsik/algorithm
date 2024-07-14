package ds00.src.프로그래머스레벨1_5;

class 내적 {
	public int solution(int[] a, int[] b) {
		int answer = 0;

		for(int i=0; i<a.length; i++){
			answer += a[i]* b[i];
		}
		return answer;
	}
}