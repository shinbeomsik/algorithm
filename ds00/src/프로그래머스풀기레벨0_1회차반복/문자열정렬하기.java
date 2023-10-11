package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 문자열정렬하기 {

	public static void main(String[] args) {
		Solution110 sol = new Solution110();
		String my_string = "";

		 List<Integer> answer = sol.solution(my_string);
		System.out.println(answer);

	}
}

class Solution110 {
    public List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        String[] arr = my_string.split("");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("0") || arr[i].equals("1")|| arr[i].equals("2")|| arr[i].equals("3")|| arr[i].equals("4")|| arr[i].equals("5")|| arr[i].equals("6")|| arr[i].equals("7")|| arr[i].equals("8")|| arr[i].equals("9")) {
                answer.add(Integer.parseInt(arr[i]));
            }
        }
        
        Collections.sort(answer);
        return answer;
    }
}