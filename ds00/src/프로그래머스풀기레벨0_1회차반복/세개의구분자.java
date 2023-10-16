package 프로그래머스풀기레벨0_1회차반복;


import java.util.*;
public class 세개의구분자 {

	public static void main(String[] args) {
		Solution152 sol = new Solution152();
		String myStr = "";

		List<String> answer = sol.solution(myStr);
		System.out.println(answer);

	}
}

class Solution152 {
	 public List<String> solution(String myStr) {
	       List<String>  answer = new ArrayList<>();
	        myStr = myStr.replaceAll("a" , "@")
	                     .replaceAll("b" , "@")
	                     .replaceAll("c" , "@");
	        
	        String[] arr = myStr.split("@");
	        
	        for(int i=0;i<arr.length;i++){
	            if(arr[i].length() != 0 ){
	                answer.add(arr[i]);
	            }
	        }
	        
	        if(answer.size() == 0){
	            answer.add("EMPTY");
	        }
	        return answer;
	    }
}