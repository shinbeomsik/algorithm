package 프로그래머스레벨1_반복2;

import java.util.*;
public class 폰켓몬 {
	   
}

class Solution49 {
	  public int solution(int[] nums) {
	        int answer = 0;
	        int take = nums.length/2;
	        Arrays.sort(nums);
	        List<Integer> arr = new ArrayList<>();
	        arr.add(nums[0]);
	        for(int i=1; i<nums.length; i++){
	            if(nums[i] != nums[i-1]){
	                arr.add(nums[i]);
	            }
	        }
	        if(arr.size() <= take){
	            answer = arr.size();
	        }else{
	            answer = take;
	        }
	        
	        return answer;
	    }
}