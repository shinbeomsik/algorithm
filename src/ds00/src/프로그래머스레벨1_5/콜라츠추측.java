package ds00.src.프로그래머스레벨1_5;

class 콜라츠추측 {
	public int solution(int num) {
		int answer = 0;
		int count = 0;
		long num2 = (long)num;
		if(num ==1){
			return answer;
		}
		while(count != 500){
			if(num2 % 2 ==0){
				num2 = num2/2;
			}else{
				num2 = num2 *3 + 1;
			}

			count++;

			if(num2 ==1){
				answer = count;
				break;
			}
		}

		if(count == 500){
			answer = -1;
		}
		return answer;
	}
}