package ds00.src.프로그래머스레벨1_5;

class 문자열다루기기본 {
	public boolean solution(String s) {
		boolean answer = false;
		if(s.length() == 4 || s.length() ==6){
			s = s.replaceAll("0" , "")
					.replaceAll("1" , "")
					.replaceAll("2" , "")
					.replaceAll("3" , "")
					.replaceAll("4" , "")
					.replaceAll("5" , "")
					.replaceAll("6" , "")
					.replaceAll("7" , "")
					.replaceAll("8" , "")
					.replaceAll("9" , "");

			s = s.trim();

			if(s.length() ==0){
				answer = true;
			}
		}
		return answer;
	}
}