package 프로그래머스풀기레벨0_1회차반복;



public class 수조작하기1 {

	public static void main(String[] args) {
		Solution46 sol = new Solution46();
		int n = 70;
		String control= "";

		int answer = sol.solution(n, control);
		System.out.println(answer);

	}
}

class Solution46 {
	 public int solution(int n, String control) {
	        int answer = n;
	        String[] arr = control.split("");
	        
	        for(int i=0;i<arr.length;i++){
	            if(arr[i].equals("w")){
	                answer = answer + 1;
	            }else if(arr[i].equals("s")){
	                answer = answer -1;
	            }else if(arr[i].equals("d")){
	                answer = answer +10;
	            }else {
	                 answer = answer -10;
	            }
	        }
	        return answer;
	    }
}