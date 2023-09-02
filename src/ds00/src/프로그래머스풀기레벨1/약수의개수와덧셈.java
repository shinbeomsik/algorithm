
package 프로그래머스풀기레벨1;


public class 약수의개수와덧셈 {

	public static void main(String[] args) {
		Solution18 sol = new Solution18();
		int left = 13;
		int right = 17;

		int answer = sol.solution(left, right);
		System.out.println(answer);

	}
}

class Solution18 {
	public int solution(int left, int right) {
        int answer = 0;
        int count =0;
        for(int i= left; i<=right;i++) {
        	count=0;
        	for(int k=1; k<=i; k++) {
        		if(i%k==0) {
        			count++;
        		}
        	}
        	System.out.println(count);
        	if(count%2==0) {
        		answer = answer + i;
        	}else {
        		answer = answer - i;
        	}
        	System.out.println(answer);
        }
        return answer;
    }
}