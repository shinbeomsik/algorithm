package 프로그래머스풀기레벨1_;

import java.util.*;

public class 문자열내마음대로정렬하기 {

	public static void main(String[] args) {
		Solution38 sol = new Solution38();
		String[] strings = {}; 
		int n = 1;

		String[] answer = sol.solution(strings, n);
		System.out.println(answer);

	} 
}

class Solution38{
	public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i=0;i<strings.length;i++){
            list.add(strings[i].charAt(n)+strings[i]);           
        }
        
        answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
        
        for(int i=0;i<answer.length;i++){
           answer[i] =  answer[i].substring(1);
        }
        return answer;
    }
}