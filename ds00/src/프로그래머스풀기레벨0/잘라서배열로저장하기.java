package 프로그래머스풀기레벨0;

import java.util.*;

public class 잘라서배열로저장하기 {

	public static void main(String[] args) {
		Solution126 sol = new Solution126();
		String my_str = "abc1Addfggg4556b"	;
		int n = 6;

		List<String> answer = sol.solution(my_str, n);
		System.out.println(answer);

	}
}  

class Solution126{
	public static List<String> solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();

        int i = 0;
        while(i < my_str.length()){
            if(i + n > my_str.length()){
                answer.add(my_str.substring(i));
                break;
            }else{
                answer.add(my_str.substring(i, i+n));
                i += n;
            }
        }
        
        return answer;
    }
}