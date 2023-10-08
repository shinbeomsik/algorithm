package 프로그래머스풀기레벨0_1회차반복;



public class 문자열곱하기 {

	public static void main(String[] args) {
		Solution60 sol = new Solution60();
		String my_string = "";
		int k = 1;

		String answer = sol.solution(my_string, k);
		System.out.println(answer);

	}
}

class Solution60 {
	 public String solution(String my_string, int k) {
	        String answer = "";
	        for(int i=0;i<k;i++){
	            answer = answer + my_string;
	        }
	        return answer;
	    }
}

//   return my_string.repeat(k); 훨씬 처리속도 빠르다