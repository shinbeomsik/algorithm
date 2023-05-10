
package 프로그래머스풀기레벨0;

import java.util.Arrays;

public class 가장큰수찾기 {

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] array = {1, 8, 3};

		int[] answer = sol.solution(array);
		System.out.println(answer);

	}
}

class Solution2 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
         int max = array[0];
         int min = array[0];
         
         for(int i=0; i<array.length;i++) {
        	 if(array[i] > max) {
        		 max = array[i];
        	 }
        	 if(array[i] < min) {
        		 max = array[i];
        	 }
        	 
         }
         answer[0] = max;
         answer[1] = min;
         System.out.println(Arrays.toString(answer));
        return answer;
    }
}