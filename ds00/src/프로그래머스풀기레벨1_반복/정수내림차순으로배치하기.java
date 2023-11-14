package 프로그래머스풀기레벨1_반복;

import java.util.*;

public class 정수내림차순으로배치하기 {

	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		long n = 70;

		long answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution11 {
    public long solution(long n) {
        long answer = 0;
        String k = Long.toString(n);
        String[] arr = k.split("");

        Arrays.sort(arr, Collections.reverseOrder());
        k = String.join("",arr);
        answer = Long.parseLong(k);
        return answer;
    }
}