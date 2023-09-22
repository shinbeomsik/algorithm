package 프로그래머스풀기레벨0;


public class 문자열여러번뒤집기 {

	public static void main(String[] args) {
		Solution134 sol = new Solution134();
		String my_string = "rermgorpsam"; 
		int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}} ; 

		String answer = sol.solution(my_string, queries);
		System.out.println(answer);

	}
}  

class Solution134 {
	public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray(); 
        
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            
            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                
                start++;
                end--;
            }
        }
        String answer = new String(arr);
        return answer;
    }
}
