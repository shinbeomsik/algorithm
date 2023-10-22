package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 왼쪽오른쪽 {

	public static void main(String[] args) {
		Solution175 sol = new Solution175();
		String[] str_list = {};

		List<String> answer = sol.solution(str_list);
		System.out.println(answer);

	}
}

class Solution175 {
	 public List<String> solution(String[] str_list) {
	        List<String> answer = new ArrayList<>();
	        int index_l =0;
	        int index_r =0;
	        for(int i=0;i<str_list.length;i++){
	            if(str_list[i].equals("l")){
	                index_l = i;
	                break;
	            }else  if(str_list[i].equals("r")){
	                index_r = i;
	                break;
	            }
	        }
	        
	        if(index_l!=0){
	            for(int i=0 ;i<index_l; i++){
	                answer.add(str_list[i]);
	            }
	        }else if(index_r !=0){
	            for(int i=index_r+1;i<str_list.length;i++){
	                answer.add(str_list[i]);
	            }
	        }else if(str_list[0].equals("r")) {
	        	for(int i=1; i<str_list.length;i++) {
	        		answer.add(str_list[i]);
	        	}
	        }
	        return answer;
	    }
}