package 프로그래머스풀기레벨1_1회차반복;

import java.util.*;
public class 모의고사 {

	public static void main(String[] args) {
		Solution49 sol = new Solution49();
		int[] answers = {};

		int[] answer = sol.solution(answers);
		System.out.println(answer);

	} 
}

class Solution49 {
	public int[]  solution(int[] answers) {
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = new int[3];

        for(int i=0;i<answers.length;i++){
            if(answers[i] == supo1[i%5]){
                score[0]++;        
            }
            if(answers[i] == supo2[i%8]){
                score[1]++;          
            }
            if(answers[i] == supo3[i%10]){
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