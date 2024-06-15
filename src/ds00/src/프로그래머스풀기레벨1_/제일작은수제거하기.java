package 프로그래머스풀기레벨1_;

import java.util.*;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		Solution20 sol = new Solution20();
		int[] arr = {};

		List<Integer> answer = sol.solution(arr);
		System.out.println(answer);
	} 
}

class Solution20 {
    public List<Integer> solution(int[] arr) {
        if(arr.length > 1){
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            answer.add(arr[i]);
        }
        Arrays.sort(arr);
    
        for(int i=0;i<answer.size();i++){
            if(arr[0] == answer.get(i)){
                answer.remove(answer.get(i));
            }
        }
            
        return answer;
        }else {
           List<Integer> answer = new ArrayList<>();
            answer.add(-1);
            return answer;
        }
    }
}