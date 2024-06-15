package 프로그래머스레벨1_반복4;
import java.util.*;

public class 폰켓몬 {
	   
}

class Solution48 {
	public int solution(int[] nums) {
        int answer = 1;
        int max = nums.length/2; // 최대 고를수 있는 폰켓몬 
        Arrays.sort(nums); // 같은 숫자가 되도록 정렬
        
        for(int i=1; i<nums.length; i++){
            if(answer == max){ // answer 가 max까지 되면 더이상 셀 필요가 없음
                break;
            }
            if(nums[i] != nums[i-1]){ // i번쨰 수가 i-1번째 수와 다르면 answer 증가
                answer++;
            }
        }
    
        return answer;
    }
}