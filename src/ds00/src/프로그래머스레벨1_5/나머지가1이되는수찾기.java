package ds00.src.프로그래머스레벨1_5;

class 나머지가1이되는수찾기 {
	public int solution(int n) {
		int answer = 0;

		for(int i=1; i<=n; i++){
			if(n%i ==1){
				answer = i;
				break;
			}
		}
		return answer;
	}
}