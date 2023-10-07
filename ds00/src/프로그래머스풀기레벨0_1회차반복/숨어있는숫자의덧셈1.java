package 프로그래머스풀기레벨0_1회차반복;



public class 숨어있는숫자의덧셈1 {

	public static void main(String[] args) {
		Solution36 sol = new Solution36();
		String my_string = "";
		int answer = sol.solution(my_string);
		System.out.println(answer);

	}
}

class Solution36 {
	   public int solution(String my_string) {
	        int answer = 0;
	        String[] arr = my_string.split("");
	        
	        for(int i=0;i<arr.length;i++){
	             if (arr[i].matches("[1-9]")) {
	                answer = answer + Integer.parseInt(arr[i]);
	            }
	        }
	        return answer;
	    }
}