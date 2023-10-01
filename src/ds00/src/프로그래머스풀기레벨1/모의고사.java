
package 프로그래머스풀기레벨1;

import java.util.*;
public class 모의고사 {

	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] answers= {1,2,3,4,5};

		int[] answer = sol.solution(answers);
		System.out.println(Arrays.toString(answer));

	} 
}

class Solution45 {
	 public int[] solution(int[] answers) {
	        int[] first = {1,2,3,4,5}; //5개씩 반복
	        int[] second = {2,1,2,3,2,4,2,5}; // 8개씩 반복
 	        int[] third = {3,3,1,1,2,2,4,4,5,5}; // 10개씩 반복
 	        int[] score = {0,0,0};
 	        
 	        for(int i=0;i<answers.length;i++) {
 	        	if(answers[i] == first[i%5]) {
 	        		score[0]++;
 	        	}
 	        	if(answers[i] == second[i%8]) {
 	        		score[1]++;
 	        	}
 	        	if(answers[i] == third[i%10]) {
 	        		score[2]++;
 	        	}
 	        }
 	        
 	        int max = Math.max(score[0], Math.max(score[1], score[2]));
 	        
 	        List<Integer> arr = new ArrayList<>();
 	        for(int i=0;i<score.length;i++) {
 	        	if(max == score[i]) {
 	        		arr.add(i+1);
 	        	}
 	        }
 	        int[] answer = new int[arr.size()];
 	        for(int i=0;i<arr.size();i++) {
 	        	answer[i] = arr.get(i);
 	        }
 	        
 	        return answer;
	    }
}