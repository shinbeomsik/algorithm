package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 배열만들기6 {

	public static void main(String[] args) {
		Solution189 sol = new Solution189();
		int[] arr = {};

		List<Integer> answer = sol.solution(arr);
		System.out.println(answer);

	}
}

class Solution189 {
	 public List<Integer> solution(int[] arr) {
	        List<Integer> answer = new ArrayList<>();
	        
	        int i=0;
	        while(i < arr.length){
	            if(answer.size()==0){
	                answer.add(arr[i]);
	                i++;
	            }else{
	                if(answer.get(answer.size()-1) == arr[i]){
	                    answer.remove(answer.size()-1);
	                    i++;
	                }else {
	                    answer.add(arr[i]);
	                    i++;
	                }
	            }
	        }
	        
	        if(answer.size() ==0){
	            answer.add(-1);
	        }
	        return answer;
	    }
}