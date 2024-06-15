package 프로그래머스레벨1_2;


public class 소수찾기 {
	   
}

class Solution54 {
	 public int solution(int n) {
	        int answer = 0;
	        int[] arr = new int[n+1];
	        for(int i=1; i<arr.length;i++){
	            for(int j=i; j<arr.length;j = j+i){
	                arr[j]++;
	            }
	        }
	        for(int i=2;i<arr.length;i++){
	            if(arr[i] ==2){
	                answer++;
	            }
	        }
	        return answer;
	    }
}