package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 빈배열에추가삭제하기 {

	public static void main(String[] args) {
		Solution143 sol = new Solution143();
		int[] arr = {};
		boolean[] flag = {};

		List<Integer> answer = sol.solution(arr, flag);
		System.out.println(answer);

	}
}

class Solution143 {
	 public List<Integer> solution(int[] arr, boolean[] flag) {
	        List<Integer> answer = new ArrayList<>();
	        
	        for(int i=0;i<flag.length;i++){
	            if(flag[i]){
	                for(int j=0;j<arr[i]*2;j++){
	                    answer.add(arr[i]);
	                }
	            }else{
	                 for(int j=0;j<arr[i];j++){
	                       answer.remove(answer.size()-1);
	                }
	            }
	        }
	        return answer;
	    }
}