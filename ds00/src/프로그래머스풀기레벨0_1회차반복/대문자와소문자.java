package 프로그래머스풀기레벨0_1회차반복;



public class 대문자와소문자 {

	public static void main(String[] args) {
		Solution103 sol = new Solution103();
		String my_string = "";

		String answer = sol.solution(my_string);
		System.out.println(answer);

	}
}

class Solution103 {
	 public String solution(String my_string) {
	        String answer = "";
	        char[] arr = my_string.toCharArray();
	        
	        for(int i=0;i<arr.length;i++){
	            String k = String.valueOf(arr[i]);
	            if(arr[i] < 'a'){
	                k = String.valueOf(arr[i]).toLowerCase();
	            }else{
	                k = String.valueOf(arr[i]).toUpperCase();
	            }
	           
	            answer = answer + k;
	        }
	        
	        return answer;
	    }
}