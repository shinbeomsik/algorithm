package 프로그래머스풀기레벨0_1회차반복;



public class 글자이어붙여문자열만들기 {

	public static void main(String[] args) {
		Solution65 sol = new Solution65();
		String my_string = ""; 
		int[] index_list = {};

		String answer = sol.solution(my_string, index_list);
		System.out.println(answer);

	}
}

class Solution65 {
	 public String solution(String my_string, int[] index_list) {
	        String answer = "";
	        String[] arr = my_string.split("");
	        for(int i=0;i<index_list.length ;i++){
	            answer = answer + arr[index_list[i]];
	        }
	        return answer;
	    }
}
//이 방법이 빠르다 !!
//StringBuffer answer = new StringBuffer();
//
//for(int idx: index_list) {
//    answer.append(my_string.charAt(idx));
//}
//return answer.toString();