package 프로그래머스풀기레벨1_반복;



public class x만큼간격이있는n개의숫자 {

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		int x = 1; 
		int n = 1;

		long[] answer = sol.solution(x, n);
		System.out.println(answer);

	}
}

class Solution1 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int count = 0;
        for(int i=0;i<n;i++){
            answer[count] = x + (long)x*count;
            count++;
        }
        return answer;
    }
}