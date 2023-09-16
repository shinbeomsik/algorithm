package 프로그래머스풀기레벨0;


public class k의개수 {

	public static void main(String[] args) {
		Solution105 sol = new Solution105();
		int i = 1;
		int j = 13;
		int k = 1;

		int answer = sol.solution(i, j, k);
		System.out.println(answer);

	}
}  

class Solution105 {
	public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int a=i; a<=j;a++) {
        	int count = a;
        	
        	while(count !=0) {
        		if(count%10 ==k) {
        			answer++;
        			count /= 10;
        		}else {
        			count /= 10;
        		}
        	}
        }
        return answer;
    }
}