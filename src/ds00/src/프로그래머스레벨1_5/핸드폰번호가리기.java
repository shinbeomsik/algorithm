package ds00.src.프로그래머스레벨1_5;
class 핸드폰번호가리기 {
	public String solution(String phone_number) {
		String answer = "";

		String[] arr = phone_number.split("");

		for(int i=0; i<arr.length-4;i++){
			arr[i] = "*";
		}

		answer = String.join("",arr);
		return answer;
	}
}