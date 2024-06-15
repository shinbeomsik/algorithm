package 프로그래머스풀기레벨1_;

import java.util.*;
public class 두개뽑아서더하기 {

	public static void main(String[] args) {
		Solution42 sol = new Solution42();
		int[] numbers = {};

		List<Integer> answer = sol.solution(numbers);
		System.out.println(answer);

	} 
}

class Solution42 {
	  public List<Integer> solution(int[] numbers) {
	        List<Integer> answer = new ArrayList<>();
	        List<Integer> arr = new ArrayList<>();
	        for(int i=0;i<numbers.length;i++){
	            for(int j=i+1;j<numbers.length;j++){
	                arr.add(numbers[i]+numbers[j]);
	            }
	        }
	        Collections.sort(arr);
	        answer.add(arr.get(0));
	        for(int i=1;i<arr.size();i++){
	            if(!arr.get(i).equals(arr.get(i-1))){
	                answer.add(arr.get(i));
	            }
	        }
	        return answer;
	    }
}