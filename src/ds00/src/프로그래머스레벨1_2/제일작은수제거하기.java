package 프로그래머스레벨1_반복2;

import java.util.*;
public class 제일작은수제거하기 {
	   
}

class Solution20 {
	 public List<Integer> solution(int[] arr) {
	        List<Integer> answer = new ArrayList<>();
	        for(int i=0;i<arr.length;i++){
	            answer.add(arr[i]);
	        }
	        Arrays.sort(arr);
	        
	        for(int i=0;i<answer.size();i++){
	            if(answer.get(i) == arr[0]){
	                answer.remove((i));
	                break;
	            }
	        }
	        if(answer.size()==0){
	            answer.add(-1);
	        }
	        return answer;
	    }
}