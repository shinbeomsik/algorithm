package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 잘라서배열로저장하기 {

	public static void main(String[] args) {
		Solution167 sol = new Solution167();
		String my_str = "";
		int n = 1;

		 List<String> answer = sol.solution(my_str, n);
		System.out.println(answer);

	}
}

class Solution167 {
	 public List<String> solution(String my_str, int n) {
	        List<String> answer = new ArrayList<>();
	        String[] arr = my_str.split("");
	        for(int i=0;i<arr.length;i=i+n){
	            String k = "";
	            if(i+n<=arr.length){
	                for(int j=i;j<i+n;j++){
	                    k = k + arr[j];
	                }
	            }else{
	                for(int j=i; j < arr.length;j++){
	                    k = k + arr[j];
	                }
	            }
	            
	            answer.add(k);
	        }
	        return answer;
	    }
}