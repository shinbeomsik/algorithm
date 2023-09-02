
package 프로그래머스풀기레벨0;
import java.util.*;

public class 첫번째로나오는음수 {

	public static void main(String[] args) {
		Solution33 sol = new Solution33();
		int[] num_list = {12, 4, 15, 46, 38, 15};

		int answer = sol.solution(num_list);
		System.out.println(answer);

	}
}

class Solution33 {
	public int solution(int[] num_list) {
        int answer = 0;
        for(int i=0; i<num_list.length;i++) {
        	if(num_list[i]<0) {
        		answer = i;
        		break;
        	}else {
        		answer = -1;
        	}
        }
        return answer;
    }
}