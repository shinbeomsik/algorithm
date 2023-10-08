package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 카운트다운 {

	public static void main(String[] args) {
		Solution78 sol = new Solution78();
		int start_num =1 ; 
		int end_num = 1;

		List<Integer>  answer = sol.solution(start_num, end_num);
		System.out.println(answer);

	}
}

class Solution78 {
	public List<Integer>  solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<>();
        for(int i= start_num ;i>=end_num;i--){
            answer.add(i);
        }
        return answer;
    }
}