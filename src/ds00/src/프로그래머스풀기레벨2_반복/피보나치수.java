package 프로그래머스풀기레벨2_반복;


public class 피보나치수 {
	   
}

class Solution9 {
	  public int solution(int n) {
	        int answer = 0;
	        long k_2 =0;
	        long k_1 =1;
	        long k = k_2 + k_1;
	        int count =2;
	        while(count != n){
	            k_2 = k_1 %1234567;
	            k_1 = k %1234567;
	            k = k_2 + k_1;
	            count++;; 
	        }
	        answer = (int)k;
	        return answer;
	    }
}