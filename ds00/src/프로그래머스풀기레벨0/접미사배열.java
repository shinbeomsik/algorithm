package 프로그래머스풀기레벨0;

import java.util.*;

public class 접미사배열 {

	public static void main(String[] args) {
		Solution80 sol = new Solution80();
		String my_string = "programmers";

		List<String> answer = sol.solution(my_string);
		System.out.println(answer);

	}
}  

class Solution80 {
	public List<String> solution(String my_string) {
        List<String> answer = new ArrayList<>();
        for(int i=0;i<my_string.length();i++) {
        	answer.add(my_string.substring(i, my_string.length()));
        }
        Collections.sort(answer); // Arrays를 대신 저걸 사용한다 
        return answer;
    }
}