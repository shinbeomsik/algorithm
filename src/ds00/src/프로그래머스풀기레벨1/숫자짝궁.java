package 프로그래머스풀기레벨1;



public class 숫자짝궁 {

	public static void main(String[] args) {
		Solution53 sol = new Solution53();
		String X = "12321";
		String Y = "42531";

		String answer = sol.solution(X, Y);
		System.out.println(answer);

	} 
}

class Solution53 {
	 public String solution(String X, String Y) {
	        String answer = "";
	        StringBuilder sb = new StringBuilder(); // 시간초과 해결을 위한 StringBuilder
	        
	        // char 배열로 변환
	        char[] x = X.toCharArray();
	        char[] y = Y.toCharArray();
	        
	        // 0 ~ 9 값들의 개수 저장할 배열
	        int[] xCheckCnt = new int[10];
	        int[] yCheckCnt = new int[10];
	        
	        // 개수 세기
	        for(int i = 0; i < x.length; i++) {
	            int tmp = x[i] - '0';
	            xCheckCnt[tmp]++;
	        }
	        for(int i = 0; i < y.length; i++) {
	            int tmp = y[i] - '0';
	            yCheckCnt[tmp]++;
	        }
	        
	        // 9 ~ 0까지 x와 y가 가진 수 중 최솟값을 구해 StringBuilder에 최솟값만큼 해당 숫자 넣기
	        for(int i = 9; i >= 0; i--) {
	            int cnt = Math.min(xCheckCnt[i], yCheckCnt[i]);
	            for(int t = 0; t < cnt; t++) {
	                sb.append(i); // StringBuilder에 입력
	            }
	        }
	        
	        // StringBuilder -> String 변환
	        answer = sb.toString();
	        
	        // 일치하는 값이 없는 경우 -> -1 출력
	        if(answer.length() == 0) {
	            answer = "-1";
	            return answer;
	        }
	        
	        // 가장 큰 값이 0인 경우 -> 0 출력
	        if(answer.charAt(0) == '0') {
	            answer = "0";
	        }

	        return answer;
	    }
}