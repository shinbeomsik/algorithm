package 프로그래머스풀기레벨0;


public class 컨트롤제트 {

	public static void main(String[] args) {
		Solution118 sol = new Solution118();
		String s = "-1 -2 -3 Z";

		int answer = sol.solution(s);
		System.out.println(answer);

	}
}  

class Solution118 {
	 public int solution(String s) {
	        int answer = 0;
	        String[] arr = s.split(" ");
	        for(int i=0; i<arr.length;i++) {
	        	if(arr[i].equals("Z")) {
	        		answer = answer - Integer.parseInt(arr[i -1]);
	        	}else {
	        		answer = answer + Integer.parseInt(arr[i]);
	        	}
	        }
	        return answer;
	    }
}