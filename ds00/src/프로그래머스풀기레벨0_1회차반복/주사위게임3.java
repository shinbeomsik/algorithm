package 프로그래머스풀기레벨0_1회차반복;


import java.util.*;
public class 주사위게임3 {

	public static void main(String[] args) {
		Solution191 sol = new Solution191();
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;

		int answer = sol.solution(a, b, c, d);
		System.out.println(answer);

	}
}

class Solution191 {
	  public int solution(int a, int b, int c, int d) {
	        int answer = 0;
	        int[] arr = new int[4];
	        arr[0] = a;
	        arr[1] = b;
	        arr[2] = c;
	        arr[3] = d;
	        
	        Arrays.sort(arr);
	        
	        int count =0;
	        
	        if(arr[0] != arr[1] && arr[1] !=arr[2] && arr[2] !=arr[3]){
	            answer =arr[0];
	        }else if(arr[0] != arr[1] && arr[1] == arr[2] && arr[2] ==arr[3]){
	            answer = (10*arr[1] + arr[0])*(10*arr[1] + arr[0]);
	        }else if(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] !=arr[3]){
	            answer = (10*arr[0] + arr[3])*(10*arr[0] + arr[3]);
	        }else if(arr[0] == arr[1] && arr[1] != arr[2] && arr[2] == arr[3]){
	            answer = (arr[0] + arr[2]) * Math.abs(arr[0] - arr[2]);
	        }else if(arr[0] == arr[1] && arr[1] != arr[2] && arr[2] != arr[3]){
	            answer = arr[2] * arr[3];
	        }else if(arr[0] != arr[1] && arr[1] == arr[2] && arr[2] != arr[3]){
	            answer = arr[0] * arr[3];
	        }else if(arr[0] != arr[1] && arr[1] != arr[2] && arr[2] == arr[3]){
	            answer = arr[0] * arr[1];
	        }else if(arr[0] == arr[3]){
	            answer =1111*arr[0];
	        }
	        
	        return answer;
	    }
}