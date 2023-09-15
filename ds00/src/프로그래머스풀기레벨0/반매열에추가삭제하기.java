package 프로그래머스풀기레벨0;
import java.util.*;

public class 반매열에추가삭제하기 {

	public static void main(String[] args) {
		Solution98 sol = new Solution98();
		int[] arr = {3, 2, 4, 1, 3};
		boolean[] flag = {true, false, true, false, false};

		List<Integer> answer = sol.solution(arr, flag);
		System.out.println(answer);

	}
}  

class Solution98 {
	public List<Integer> solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<arr.length;i++) {
        	if(flag[i] == true) {
        		for(int j =0;j<arr[i]*2; j++) {
        			answer.add(arr[i]);
        		}
        	}else {
        		for(int j=0; j<arr[i];j++) {
        			answer.remove(answer.size()-1);
        		}
        	}
        }
        return answer;
    }
}