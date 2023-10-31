package 프로그래머스풀기레벨0_1회차반복;



public class 겹치는선분의길이 {

	public static void main(String[] args) {
		Solution190 sol = new Solution190();
		int[][] lines = {};

		int answer = sol.solution(lines);
		System.out.println(answer);

	}
}

class Solution190 {
	public int solution(int[][] lines) {
	    
        int answer = 0;
        int[] arr=new int[200];
        
 
        for(int i=0; i<lines.length; i++){

            for(int j=lines[i][0]+100; j<lines[i][1]+100; j++){
                arr[j]++;
            }
        }
        
        for(int i=0; i<200; i++){
            if(arr[i] >1){
                answer++;
            }
        }
        return answer;
    }
}