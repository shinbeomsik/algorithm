package 프로그래머스풀기레벨0_1회차반복;



public class 문자열겹쳐쓰기 {

	public static void main(String[] args) {
		Solution180 sol = new Solution180();
		String my_string = "";
		String overwrite_string = ""; 
		int s =1;

		String answer = sol.solution(my_string, overwrite_string, s);
		System.out.println(answer);

	}
}

class Solution180 {
	  public String solution(String my_string, String overwrite_string, int s) {
	        String answer = "";
	        
	        String[] arr = my_string.split("");
	        String[] brr = overwrite_string.split("");
	        int count = 0;
	        for(int i=s; i<s+brr.length;i++){
	            arr[i] = brr[count];
	            count++;
	        }
	        
	        answer = String.join("",arr);
	        
	        return answer;
	    }
}