package 프로그래머스풀기레벨0;

import java.util.*;
public class 숨어있는숫자의덧셈2 {

	public static void main(String[] args) {
		Solution104 sol = new Solution104();
		String my_string = "aAb1B2cC34oOp";

		int answer = sol.solution(my_string);
		System.out.println(answer);

	}
}  

class Solution104 {
	public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.replaceAll("[a-zA-Z]"," ").split(" ");
        //                                  이부분은 모든 알파벳을 가리키는 정규 표현식 패턴
        for(String s :  str){
            if(!s.equals("")){ 
                answer+=Integer.valueOf(s);
            }
        }
        return answer;
    }
}