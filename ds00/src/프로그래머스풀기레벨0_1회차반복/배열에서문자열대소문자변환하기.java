package 프로그래머스풀기레벨0_1회차반복;



public class 배열에서문자열대소문자변환하기 {

	public static void main(String[] args) {
		Solution67 sol = new Solution67();
		String[] strArr = {};

		String[] answer = sol.solution(strArr);
		System.out.println(answer);

	}
}

class Solution67 {
	 public String[] solution(String[] strArr) {
	        String[] answer = new String[strArr.length];
	        for(int i =0;i<strArr.length;i++){
	            if(i%2 !=0){
	                answer[i] = strArr[i].toUpperCase();
	            }else{
	                   answer[i] = strArr[i].toLowerCase();
	            }
	        }
	        return answer;
	    }
}