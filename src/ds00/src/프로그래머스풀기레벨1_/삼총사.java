package 프로그래머스풀기레벨1_;


public class 삼총사 {

	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] number = {};

		int answer = sol.solution(number);
		System.out.println(answer);

	} 
}

class Solution34 {
	 public int solution(int[] number) {
	        int answer = 0;
	        for(int i=0 ;i<number.length-2;i++){
	            for(int j=i+1; j<number.length-1;j++){
	                for(int k=j+1;k<number.length;k++){
	                    if((number[i] + number[j] + number[k]) ==0){
	                        answer++;
	                    }
	                }
	            }
	        }
	        return answer;
	    }
}