package 프로그래머스풀기레벨1;

import java.util.*;

public class 햄버거만들기 {

	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

		int answer = sol.solution(ingredient);
		System.out.println(answer);

	} 
}

class Solution56 {
  	public int solution(int[] ingredient) {
		int result = 0;
		Stack<Integer> stack = new Stack<>();
		for (int in : ingredient) {
			stack.push(in);
			if (stack.size() >= 4) {
				int size = stack.size();
				if(stack.get(size - 1) == 1
				    && stack.get(size - 2) == 3
					&& stack.get(size - 3) == 2
					&& stack.get(size - 4) == 1) {
					result++;
					stack.pop();
					stack.pop();
					stack.pop();
					stack.pop();
				}
			}
		}
		return result;
	}
}