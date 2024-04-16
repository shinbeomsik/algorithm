package 프로그래머스풀기레벨2_반복;

import java.util.*;
public class 최솟값만들기 {
	   
}

class Solution3 {
	 public int solution(int []A, int []B){
	        int answer = 0;
	        Arrays.sort(A);
	        Arrays.sort(B);
	        for(int i=0;i<A.length;i++){
	            answer = answer + A[i] * B[B.length-1-i];
	        }
	        return answer;
	 }	    
}