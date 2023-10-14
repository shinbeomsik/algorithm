package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 약수구하기 {

	public static void main(String[] args) {
		Solution122 sol = new Solution122();
		int n = 70;

		 List<Integer> answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution122 {
	public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                answer.add(i);
            }
        }
        return answer;
    }
}