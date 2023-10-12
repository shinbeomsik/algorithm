package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 문자열잘라서정렬하기 {

	public static void main(String[] args) {
		Solution117 sol = new Solution117();
		String myString = "";

		List<String> answer = sol.solution(myString);
		System.out.println(answer);

	}
}

class Solution117 {
	 public List<String> solution(String myString) {
         List<String> answer = new ArrayList<>();
        String[] arr = myString.split("x");
        for(int i=0; i<arr.length;i++){
            if(arr[i].length()!=0){
                answer.add(arr[i]);
            }
        }

        Collections.sort(answer);
        return answer;
    }
}