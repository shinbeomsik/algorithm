package 프로그래머스레벨1_반복4;


public class 덧칠하기 {
	   
}

class Solution52 {
	 public int solution(int n, int m, int[] section) {
	        int answer = 0;
	        
	        int[] arr = new int[n]; // n 의 길이만큼 벽 생성
	        for(int i=0; i<section.length;i++){ // section 에 있는 부분은 색칠해야하므로 
	            arr[section[i]-1]--;
	        }
	        
	        for(int i=0; i<arr.length; i++){
	            if(arr[i] == -1){
	                if(i+m <= arr.length){ //현재 위치에서 m번째까지 벽의 길이를 색칠 
	                    for(int j=i; j<i+m; j++){
	                        arr[j]++;
	                    }
	                    answer++;
	                }else{ //현재 위치에서 m번째까지 벽의 길이를 넘어서면 벽의 길이까지만 색칠
	                    for(int j=i; j<arr.length; j++){
	                        arr[j]++;
	                    }
	                    answer++;
	                }
	            }
	        }
	        return answer;
	    }
}