package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 리스트자르기 {

	public static void main(String[] args) {
		Solution157 sol = new Solution157();
		int n =1;
		int[] slicer = {}; 
		int[] num_list = {};

		 List<Integer> answer = sol.solution(n, slicer, num_list);
		System.out.println(answer);

	}
}

class Solution157 {
	 public List<Integer> solution(int n, int[] slicer, int[] num_list) {
	        List<Integer> answer = new ArrayList<>();
	        
	        if(n==1){
	            for(int i=0; i<=slicer[1];i++){
	                answer.add(num_list[i]);
	            }
	        }else if(n==2){
	            for(int i=slicer[0]; i<num_list.length;i++){
	                answer.add(num_list[i]);
	            }
	        }else if(n==3){
	            for(int i=slicer[0] ; i<=slicer[1];i++){
	                answer.add(num_list[i]);
	            }
	        }else if(n==4){
	            for(int i=slicer[0]; i <=slicer[1]; i = i+slicer[2]){
	                answer.add(num_list[i]);
	            }
	        }
	        return answer;
	    }
}