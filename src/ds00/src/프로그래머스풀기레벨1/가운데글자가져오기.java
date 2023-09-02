
package 프로그래머스풀기레벨1;


public class 가운데글자가져오기 {

	public static void main(String[] args) {
		Solution16 sol = new Solution16();
		String s = "abcd";

		String answer = sol.solution(s);
		System.out.println(answer);

	}
}

class Solution16 {
	public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        
        String[] a = {};
        		
        if(arr.length%2==0) {
        	a = new String[2];
        	a[0] = arr[arr.length/2-1];
        	a[1] = arr[arr.length/2];
        }else if(arr.length%2!=0) {
        	a = new String[1];
        	a[0] = arr[arr.length/2];
        }
        
        answer = String.join("",a);
        return answer;
    }
}