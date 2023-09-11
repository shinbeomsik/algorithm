package 프로그래머스풀기레벨0;


public class 인덱스바꾸기 {

	public static void main(String[] args) {
		Solution71 sol = new Solution71();
		String my_string ="I love you";
		int num1 = 3;
		int num2 = 6;

		String answer = sol.solution(my_string, num1, num2);
		System.out.println(answer);

	}
}  

class Solution71 {
	  public String solution(String my_string, int num1, int num2) {
	        String answer = "";
	        String[] arr = my_string.split("");
	        String k = arr[num1];
	        arr[num1] = arr[num2];
	        arr[num2] = k;
	        answer = String.join("",arr);
	        return answer;
	    }
}