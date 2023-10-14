package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 배열만들기5 {

	public static void main(String[] args) {
		Solution140 sol = new Solution140();
		String[] intStrs = {};
		int k = 1;
		int s = 1;
		int l = 1;

		 List<Integer> answer = sol.solution(intStrs, k, s, l);
		System.out.println(answer);

	}
}

class Solution140 {
	public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0;i<intStrs.length;i++){
            String t = intStrs[i].substring(s,s+l);
            if(Integer.parseInt(t) > k ){
                answer.add(Integer.parseInt(t));
            }
        }
        
        return answer;
    }
}