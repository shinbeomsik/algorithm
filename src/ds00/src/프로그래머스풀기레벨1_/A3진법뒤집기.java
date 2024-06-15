package 프로그래머스풀기레벨1_;

import java.util.*;

public class A3진법뒤집기 {

	public static void main(String[] args) {
		Solution30 sol = new Solution30();
		int n = 70;

		double answer = sol.solution(n);
		System.out.println(answer);

	} 
}

class Solution30 {
	  public double solution(int n) {
	        double answer = 0;
	        List<Integer> arr = new ArrayList<>();
	     
	        while(n != 0){
	            int k= n%3;
	            arr.add(k);
	            n = n/3;
	        }
	        for(int i=0;i<arr.size();i++){
	            answer = answer + (int)arr.get(i) * Math.pow(3,arr.size()-1-i);
	        }
	        return answer;
	    }
}