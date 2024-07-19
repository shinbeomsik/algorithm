package ds00.src.프로그래머스레벨1_5;

class 부족한금액계산하기 {
	public long solution(int price, int money, int count) {
		long answer = -1;
		long total =0;
		for(int i=1; i<=count; i++){
			total = total +(long)(price*i);
		}

		if(total > money){
			answer = total - money;
		}else{
			answer = 0;
		}
		return answer;
	}
}