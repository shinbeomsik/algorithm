package 프로그래머스풀기레벨0;


public class 문자열계산하기 {

	public static void main(String[] args) {
		Solution129 sol = new Solution129();
		String my_string = "3 + 4 - 1";

		int answer = sol.solution(my_string);
		System.out.println(answer);

	}
}  

class Solution129 {
	 public int solution(String my_string) {
	        String[] arr = my_string.split(" ");
	        
	        int answer = Integer.parseInt(arr[0]);
	        for(int i=0;i<arr.length;i++) {
	        	if(arr[i].equals("+")) {
	        		answer = answer + Integer.parseInt(arr[i+1]);
	        	}else if(arr[i].equals("-")) {
	        		answer = answer - Integer.parseInt(arr[i+1]);
	        	}
	        }
	        return answer;
	    }
}