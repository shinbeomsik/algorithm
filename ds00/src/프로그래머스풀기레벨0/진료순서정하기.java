package 프로그래머스풀기레벨0;

import java.util.*;

public class 진료순서정하기 {

	public static void main(String[] args) {
		Solution109 sol = new Solution109();
		int[] emergency = {30, 10, 23, 6, 100};

		 List<Integer> answer = sol.solution(emergency);
		System.out.println(answer);

	}
}  

class Solution109 {
	public  List<Integer> solution(int[] emergency) {
         List<Integer> answer = new ArrayList<>();
         Integer[] arr = new Integer[emergency.length];
         for(int i=0; i<emergency.length;i++) {
        	 arr[i] = emergency[i];
         }
         Arrays.sort(arr, (a, b) -> Integer.compare(b, a));
         //(a, b) -> Integer.compare(b, a)는 
         //요소 b가 요소 a보다 큰 경우 내림차순으로 정렬하도록 도와주는 람다 표현식
         
         for(int i=0; i<emergency.length;i++) {
        	 for(int j=0;j<emergency.length;j++) {
        		 if(emergency[i] == arr[j]) {
        			 answer.add(j+1);	
        			 break;
        		 }
        	 }
         }
        return answer;
    }
}