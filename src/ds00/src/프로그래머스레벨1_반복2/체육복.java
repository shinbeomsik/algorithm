package 프로그래머스레벨1_반복2;


public class 체육복 {
	   
}

class Solution59 {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i=0;i<lost.length;i++){
            arr[lost[i]]--;
        }
        for(int i=0;i<reserve.length;i++){
            arr[reserve[i]]++;
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i] + arr[i+1] ==0){
                arr[i] =0;
                arr[i+1] =0;
            }
        }
         for(int i=1;i<arr.length;i++){
            if(arr[i] >= 0){
                answer++;
            }
        }
        return answer;
    }
}