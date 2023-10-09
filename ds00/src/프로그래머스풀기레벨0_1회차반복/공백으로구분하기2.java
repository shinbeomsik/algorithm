package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 공백으로구분하기2 {

	public static void main(String[] args) {
		Solution88 sol = new Solution88();
		String my_string = "";

		List<String> answer = sol.solution(my_string);
		System.out.println(answer);

	}
}

class Solution88 {
	public  List<String> solution(String my_string) {
        my_string =  my_string.trim();
    
       String[] arr = my_string.split(" ");

       List<String> answer = new ArrayList<>();
       
       for(int i=0;i<arr.length;i++){
           if(!arr[i].trim().equals("")){
               answer.add(arr[i].trim());
           }
       }
       
       return answer;
   }
}