package 프로그래머스풀기레벨0_1회차반복;



public class 수열과구간쿼리4 {

	public static void main(String[] args) {
		Solution170 sol = new Solution170();
		int[] arr = {}; 
		int[][] queries = {};

		int[] answer = sol.solution(arr, queries);
		System.out.println(answer);

	}
}

class Solution170 {
	public int[] solution(int[] arr, int[][] queries) {
	     
        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                if(j %queries[i][2]==0){
                    arr[j]++;
                }
            }
        }

        return arr;
    }
}