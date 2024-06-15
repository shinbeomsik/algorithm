package 프로그래머스풀기레벨1_;

import java.util.*;
public class 폰켓몬 {

	public static void main(String[] args) {
		Solution46 sol = new Solution46();
		int[] nums = {};

		int answer = sol.solution(nums);
		System.out.println(answer);

	} 
}

class Solution46 {
	 public int solution(int[] nums) {
	        int answer = 0;
	        int k = nums.length/2;
	        List<Integer> arr = new ArrayList<>();
	        Arrays.sort(nums);
	        arr.add(nums[0]);

	        for(int i=1;i<nums.length;i++){
	            if(nums[i] != nums[i-1]){
	                arr.add(nums[i]);
	            }
	        }
	        if(arr.size() > nums.length/2){
	            answer = nums.length/2;
	        }else{
	            answer = arr.size();
	        }
	        return answer;
	    }
}