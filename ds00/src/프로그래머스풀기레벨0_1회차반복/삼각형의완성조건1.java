package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 삼각형의완성조건1 {

	public static void main(String[] args) {
		Solution30 sol = new Solution30();
		int[] sides = {70};

		int answer = sol.solution(sides);
		System.out.println(answer);

	}
}

class Solution30 {
	public int solution(int[] sides) {
        int answer = 2;
        Arrays.sort(sides);
        if(sides[0] + sides[1] > sides[2]){
            answer = 1;
        }
        return answer;
    }
}