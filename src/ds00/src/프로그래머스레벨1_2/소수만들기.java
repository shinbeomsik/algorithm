package 프로그래머스레벨1_반복2;


public class 소수만들기 {
	   
}

class Solution53 {
	public int solution(int[] nums) {
        int answer = 0;
        
        int[] yaksu = new int[3001];
        yaksu[0] = -1;
        for(int i=1;i<=yaksu.length-1;i++){
            for(int j=i; j<=yaksu.length-1;j = j+i){
                yaksu[j]++;
            }
        }
        
       for(int i=0;i<nums.length-2;i++){
           for(int j=i+1;j<nums.length-1;j++){
               for(int k=j+1;k<nums.length;k++){
                   if(yaksu[nums[i] + nums[j] + nums[k]] ==2){
                       answer++;
                   }
               }
           }
       }
        return answer;
    }
}