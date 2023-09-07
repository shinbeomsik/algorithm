
package 프로그래머스풀기레벨0;

import java.util.*;
public class 배열의원소삭제하기 {

	public static void main(String[] args) {
		Solution59 sol = new Solution59();
		int[] arr = {293, 1000, 395, 678, 94};
		int[] delete_list = {94, 777, 104, 1000, 1, 12};

		List answer = sol.solution(arr, delete_list);
		System.out.println(answer);

	}
}  

class Solution59 {
	   public List solution(int[] arr, int[] delete_list) {
		   
	        List<Integer> answer = new ArrayList<>();
	        
	        for(int i=0; i<arr.length;i++) {
	        	answer.add(arr[i]);
	        }
	        for(int i=0;i<arr.length;i++) {
	        	for(int j=0;j < delete_list.length; j++) {
	        		if(arr[i] == delete_list[j]) {
	        			answer.remove(Integer.valueOf(arr[i])); 
	        			// 이 메서드는 정적(static) 메서드로서, 정수 값을 포장된 Integer 객체로 변환합니다. 
	        			// 다음과 같이 사용합니다: Integer.valueOf(정수값)
	        		}
	        	}
	        }
	        return answer;
	    }
}