package 프로그래머스풀기레벨0_1회차반복;



public class L로만들기 {

	public static void main(String[] args) {
		Solution91 sol = new Solution91();
		String myString= "";

		String answer = sol.solution(myString);
		System.out.println(answer);

	}
}

class Solution91 {
	  public String solution(String myString) {
	        String answer = "";
	        char[] arr = myString.toCharArray();
	       
	        for(int i=0;i<arr.length;i++){
	            if(arr[i] < 'l'){
	                arr[i] = 'l';
	            }
	        }
	        
	        answer = new String(arr);
	        
	        return answer;
	    }
}