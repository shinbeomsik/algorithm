package 프로그래머스풀기레벨0_1회차반복;



public class A_0뗴기 {

	public static void main(String[] args) {
		Solution98 sol = new Solution98();
		String n_str = "";

		String answer = sol.solution(n_str);
		System.out.println(answer);

	}
}

class Solution98 {
	 public String solution(String n_str) {
	        String answer = "";
	        String[] arr = n_str.split("");
	        for(int i=0;i<arr.length;i++){
	            if(arr[i].equals("0")){
	                arr[i] = " ";
	            }else{
	                break;
	            }
	        }
	        
	        answer = String.join("",arr).trim();
	        return answer;
	    }
}