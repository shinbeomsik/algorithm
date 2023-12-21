package 프로그래머스레벨1_반복;


public class 가장가까운글자 {
	
}

class Solution54 {
	public int[] solution(String s) {
		   int[] answer = new int[s.length()];
		        
		        for (int i = 0; i < s.length(); i++) {
					for (int j = i; j >= 0; j--) {
						if (s.charAt(i) == s.charAt(j) && answer[i] == 0) {
							answer[i] = i - j;
							
						}
					}
					if (answer[i] == 0) {
						answer[i] = -1;
					}
				}
		        
		        return answer;
		    }
}