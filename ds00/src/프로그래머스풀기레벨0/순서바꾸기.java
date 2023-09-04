
package 프로그래머스풀기레벨0;

import java.util.Arrays;

public class 순서바꾸기 {

	public static void main(String[] args) {
		Solution57 sol = new Solution57();
		int[] num_list = {2,1,6};
		int n = 1;

		int[] answer = sol.solution(num_list, n);
		System.out.println(answer);

	}
}  

class Solution57 {
	public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index = 0;

        for (int i = n; i < num_list.length; i++) {
            answer[index++] = num_list[i];
        }

        for (int i = 0; i < n; i++) {
            answer[index++] = num_list[i];
        }
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}