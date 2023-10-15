package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 글자지우기 {

	public static void main(String[] args) {
		Solution144 sol = new Solution144();
		String my_string = "apporoograpemmemprs"; 
		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

		String answer = sol.solution(my_string, indices);
		System.out.println(answer);

	}
}

class Solution144 {
	public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        int index = 0;
        String[] arr = my_string.split("");
        for(int i=0;i<arr.length;i++){
            if(index < indices.length && indices[index] ==i){
                index++;
                arr[i] = "";
            }
        }
        answer = String.join("",arr);
        return answer;
    }
}