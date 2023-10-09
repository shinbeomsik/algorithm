package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 배열의원소삭제하기 {

	public static void main(String[] args) {
		Solution93 sol = new Solution93();
		int[] arr = {};
		int[] delete_list = {};

		 List<Integer> answer = sol.solution(arr, delete_list);
		System.out.println(answer);

	}
}

class Solution93 {
	 public List<Integer> solution(int[] arr, int[] delete_list) {
	        List<Integer> answer = new ArrayList<>();
	        List<Integer> result = new ArrayList<>();
	        for(int i=0;i<arr.length;i++){
	            answer.add(arr[i]);
	            for(int j=0;j<delete_list.length;j++){
	                if(arr[i] == delete_list[j]){
	                    result.add(arr[i]);
	                }
	            }
	        }
	      for(int i=0;i<result.size();i++){
	          answer.remove(result.get(i));
	      }
	        
	        
	        return answer;
	    }
}