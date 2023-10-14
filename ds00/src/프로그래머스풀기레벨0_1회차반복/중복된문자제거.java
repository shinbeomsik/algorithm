package 프로그래머스풀기레벨0_1회차반복;



public class 중복된문자제거 {

	public static void main(String[] args) {
		Solution133 sol = new Solution133();
		String my_string= "";

		String answer = sol.solution(my_string);
		System.out.println(answer);

	}
}

class Solution133 {
	 public String solution(String my_string) {
	        String answer = "";
	        
	        String[] arr = my_string.split("");
	        
	        for(int i=0;i<arr.length;i++){
	            if(!answer.contains(arr[i])){
	                answer = answer + arr[i];
	            }
	        }
	        
	        return answer;
	    }
}