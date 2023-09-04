package 프로그래머스풀기레벨0;
import java.util.*;
public class 배열의원소만큼추가하기 {

	public static void main(String[] args) {
		Solution43 sol = new Solution43();
		int[] arr = {5, 1, 4};

		int[] answer = sol.solution(arr);
		System.out.println(Arrays.toString(answer));

	}
}
        
class Solution43 {
	 public int[] solution(int[] arr) {
	
		    List<Integer> answer = new ArrayList<>();
	        
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i]; j++) {
	                answer.add(arr[i]);
	            }
	        }
	        
	        return answer.stream().mapToInt(i->i).toArray();
	    }
}