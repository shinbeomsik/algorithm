package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 전국대회선발고사 {

	public static void main(String[] args) {
		Solution185 sol = new Solution185();
		int[] rank = {}; 
		boolean[] attendance = {};

		int answer = sol.solution(rank, attendance);
		System.out.println(answer);

	}
}

class Solution185 {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<rank.length;i++){
            if(attendance[i]){
                arr.add(rank[i]);
            }
        }

       Collections.sort(arr);
          for(int j=0;j<rank.length;j++){
                if(arr.get(0) == rank[j]){
                    answer = answer + 10000*j;
                }
            }
         for(int j=0;j<rank.length;j++){
                if(arr.get(1) == rank[j]){
                    answer = answer + 100*j;
                }
            }
         for(int j=0;j<rank.length;j++){
                if(arr.get(2) == rank[j]){
                    answer = answer + 1*j;
                }
            }
        return answer;
    }
}