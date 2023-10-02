
package 프로그래머스풀기레벨1;

import java.util.*;

public class 기사단원의무기 {

	public static void main(String[] args) {
		Solution47 sol = new Solution47();
		int number = 10;
		int limit = 3;
		int power = 2;

		int answer = sol.solution(number, limit, power);
		System.out.println(answer);

	}
}

class Solution47 {
	 public int solution(int number, int limit, int power) {
	        int answer = 0;
	        int[] arr = new int[number + 1];

	        for (int i = 1; i <= number; i++) {
	            for (int j = i; j <= number; j += i) {
	                arr[j]++;
	            }
	        }

	        for (int i = 1; i <= number; i++) {
	            if (arr[i] <= limit) {
	                answer += arr[i];
	            } else {
	                answer += power;
	            }
	        }
	        return answer;
	    }
}

//public int solution(int number, int limit, int power) {
//    int answer = 0;
//    int[] arr = new int[number];
//    
//    for(int i=1;i<=number;i++) {
//    	int sum =0;
//    	for(int j=1;j<=i;j++) {
//    		if(i%j==0) {
//    			sum++;
//    		}
//    	}
//    	arr[i-1] = sum;
//    	sum =0;
//    }
//    
//    for(int i=0; i<arr.length;i++) {
//    	if(arr[i]<=limit) {
//    		answer = answer + arr[i];
//    	}else {
//    		answer = answer + power;
//    	}
//    }
//    return answer;
//}