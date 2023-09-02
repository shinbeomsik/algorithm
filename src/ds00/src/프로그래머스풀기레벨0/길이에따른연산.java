
package 프로그래머스풀기레벨0;
import java.util.*;

public class 길이에따른연산 {

	public static void main(String[] args) {
		Solution25 sol = new Solution25();
		int[] num_list = {2,3,4,5};

		int answer = sol.solution(num_list);
		System.out.println(answer);

	}
}

class Solution25 {
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length >=11) {
        	for(int i =0; i<num_list.length;i++) {
        		answer = answer + num_list[i];
        	}
        }else {
        	answer = 1;
        	for(int i =0; i<num_list.length;i++) {
        		answer = answer*num_list[i];
        	}
        }
        return answer;
    }
}