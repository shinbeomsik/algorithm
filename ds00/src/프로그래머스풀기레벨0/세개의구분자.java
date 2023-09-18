package 프로그래머스풀기레벨0;

import java.util.*;

public class 세개의구분자 {

	public static void main(String[] args) {
		Solution111 sol = new Solution111();
		String myStr = "cabab";

		 List<String> answer = sol.solution(myStr);
		System.out.println(answer);

	}
}  

class Solution111 {
	public  List<String> solution(String myStr) {
        List<String> answer = new ArrayList<>();
        //myStr = myStr.replace("a", "_");
        //myStr = myStr.replace("b", "_");
        //myStr = myStr.replace("c", "_");
        myStr = myStr.replaceAll("[a-c]","_");
        String[] arr = myStr.split("_");
        
        for(int i=0; i<arr.length;i++) {
        	if(!arr[i].equals("")) {
        		answer.add(arr[i]);
        	}
        }
        if(answer.size() == 0) {
        answer.add("EMPTY");
        }
        return answer;
    }
}