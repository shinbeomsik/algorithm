package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 배열만들기4 {

	public static void main(String[] args) {
		Solution171 sol = new Solution171();
		int[] arr = {};

		List<Integer> answer = sol.solution(arr);
		System.out.println(answer);

	}
}

class Solution171 {
	 public List<Integer> solution(int[] arr) {
	        List<Integer> stk = new ArrayList<>();
	        
	        int count = 0;
	    
	        while(count != arr.length){
	            if(stk.size()==0){
	                stk.add(arr[count]);
	                count++;
	            }else{
	                if(stk.get(stk.size()-1) < arr[count]){
	                    stk.add(arr[count]);
	                    count++;
	                }else{
	                    stk.remove(stk.size()-1);
	                }
	            }
	        }
	        
	        return stk;
	    }
}