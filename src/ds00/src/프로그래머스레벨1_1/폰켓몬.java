package 프로그래머스레벨1_반복;

import java.util.*;

public class 폰켓몬 {
	
}

class Solution44 {
	public int solution(int[] nums) {
        int answer = 1;
        
        Arrays.sort(nums);
        
        int max = nums.length/2;
        int start = nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(answer == max){
                break;
            }
            if(nums[i] != start){
                answer++;
                start = nums[i];
            }
        }
        return answer;
    }
}