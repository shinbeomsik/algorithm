
package 프로그래머스풀기레벨0;

import java.util.*;
public class 문자열정렬하기1 {

	public static void main(String[] args) {
		Solution67 sol = new Solution67();
		String my_string = "hi12392";

		List<Integer> answer = sol.solution(my_string);
		System.out.println(answer);

	}
}  

class Solution67 {
    public  List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        char[] arr = my_string.toCharArray();
        for(int i=0; i<arr.length;i++) {
        	if(arr[i] < 'A') {
        		answer.add((int)(arr[i]-48));
        	}
        }
        Collections.sort(answer); //List<>();을 List타입을 정렬하기위해서는 이렇게 해야됨
                                  // Arrays.sort() 이거는 char, int ,String등 다양한 배열 가능
        return answer;
    }
}