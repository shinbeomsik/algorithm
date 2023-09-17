package 프로그래머스풀기레벨0;


public class 가까운수 {

	public static void main(String[] args) {
		Solution107 sol = new Solution107();
		int[] array = {3,10, 28 ,21 ,14};
		int n = 20;

		int answer = sol.solution(array, n);
		System.out.println(answer);

	}
}  

class Solution107 {
    public int solution(int[] array, int n) {
        int answer = array[0];
        for ( int i = 1; i < array.length; i++ ) {
            int temp = array[ i ];
            int fix = Math.abs( answer - n );
            int curr = Math.abs( temp - n );

            if ( fix > curr || ( fix == curr && answer > temp ) ) {
            	answer = temp;
            }

        }
        return answer;
    }
}