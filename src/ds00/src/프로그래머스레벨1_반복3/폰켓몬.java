package 프로그래머스레벨1_반복3;

import java.util.*;
public class 폰켓몬 {
	   
}

class Solution60 {
	public int solution(int[] nums) {
        int answer = 1;
        int max = nums.length/2;
        
        Arrays.sort(nums);
        
        for(int i=1;i<nums.length;i++){
            if(answer == max){
                break;
            }
            if(nums[i] != nums[i-1]){
                answer++;    
            }
        }
        return answer;
    }
}