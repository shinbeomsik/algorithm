
package 프로그래머스풀기레벨0;

import java.util.Arrays;

public class 가장큰수찾기 {

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] array = {13, 10, 19, 11};

		int[] answer = sol.solution(array);
		System.out.println(answer);

	}
}

class Solution2 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
         int max = array[0];
         
         for(int i=0; i<array.length;i++) {
        	 if(array[i] > max) {
        		 max = array[i];
        	 }
         }
         
         for(int i=0; i<array.length;i++) {
        	  if(max == array[i]) {
        		  answer[1] = i;
        	  }
         }
         answer[0] = max;
        return answer;
    }
}