package 프로그래머스풀기레벨1_;

import java.util.*;
public class 명예의전당1 {

	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int k = 1; 
		int[] score = {};

		int[] answer = sol.solution(k, score);
		System.out.println(answer);

	} 
}

class Solution45 {
	public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> arr = new ArrayList<>();
        if(k < score.length){
           for(int i=0;i<k;i++){
               arr.add(score[i]);
               Collections.sort(arr);
               answer[i] = arr.get(0);
           }
           for(int i=k;i<score.length;i++){
               arr.add(score[i]);
               Collections.sort(arr);
               arr.remove(arr.get(0));
               answer[i] = arr.get(0);
           }
        }else {
            for(int i=0;i<score.length;i++){
                arr.add(score[i]);
                Collections.sort(arr);
                answer[i] = arr.get(0);
            }
        }
        return answer;
    }
}