
package 프로그래머스풀기레벨1;

import java.util.*;
public class 폰켓몬 {

	public static void main(String[] args) {
		Solution43 sol = new Solution43();
		int[] nums = {3,1,2,3};

		int answer = sol.solution(nums);
		System.out.println(answer);

	} 
}

class Solution43 {
    public int solution(int[] nums) {
        int answer = 0;
        
        Arrays.sort(nums);
        
        List<Integer> arr = new ArrayList<Integer>();
        
        int count =0;
        arr.add(nums[0]); 
        for(int i=1;i<nums.length;i++) {
        	if(nums[i] != arr.get(count)) {
        		arr.add(nums[i]);
        		count++;
        	}
        }
        
        if(nums.length/2 > arr.size()) {
        	answer = arr.size();
        }else {
        	answer = nums.length/2;
        }
        return answer;
    }
}