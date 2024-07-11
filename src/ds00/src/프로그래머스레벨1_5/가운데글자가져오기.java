package ds00.src.프로그래머스레벨1_5;

class 가운데글자가져오기 {
	public String solution(String s) {
		String answer = "";
		int k = s.length()/2;
		if(s.length() %2 ==0){
			answer = s.substring(k-1,k+1);
		}else{
			answer = s.substring(k,k+1);
		}
		return answer;
	}
}