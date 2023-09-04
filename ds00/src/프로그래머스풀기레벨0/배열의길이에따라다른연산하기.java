
package 프로그래머스풀기레벨0;

public class 배열의길이에따라다른연산하기 {

	public static void main(String[] args) {
		Solution49 sol = new Solution49();
		int[] arr = {49, 12, 100, 276, 33}; 
		int n = 27;
		

		int[] answer = sol.solution(arr, n);
		System.out.println(answer);

	}
}  

class Solution49 {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        
        if(arr.length%2 == 0) {
        	for(int i = 0; i<arr.length;i++) {
        		if(i%2 ==0) {
        			answer[i] = arr[i];
        		}else {
        			answer[i] = arr[i] + n;
        		}
        	}
        }else {
        	for(int i=0; i<arr.length; i++) {
        		if(i%2 !=0) {
        			answer[i] = arr[i];
        		}else {
        			answer[i] = arr[i] + n;
        		}
        	}
        }
        
        return answer;
    }
}