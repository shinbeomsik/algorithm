package 프로그래머스풀기레벨0;
import java.util.*;

public class 콜라츠수열만들기 {

	public static void main(String[] args) {
		Solution74 sol = new Solution74();
		int n = 10;

		List<Integer> answer = sol.solution(n);
		System.out.println(answer);

	}
}  

class Solution74 {
	public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n = n/2;
            } else {
                n = 3 * n + 1;
            }
            answer.add(n);
        }
        return answer;
    }
}