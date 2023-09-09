
package 프로그래머스풀기레벨0;

public class O뗴기 {

	public static void main(String[] args) {
		Solution65 sol = new Solution65();
		String n_str = "0000854020";

		String answer = sol.solution(n_str);
		System.out.println(answer);

	}
}  

class Solution65 {
	   public String solution(String n_str) {
	        String answer = "";
	        
	        String[] arr = n_str.split("");
	        for(int i=0; i<arr.length;i++) {
	        	if(arr[i].equals("0")) {
	        		arr[i] = "";
	        	}else {
	        		break;
	        	}
	        }
	        
	        answer = String.join("",arr).trim();
	        return answer;
	   }
}