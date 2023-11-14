package 프로그래머스풀기레벨1_반복;



public class 두정수사이의합 {

	public static void main(String[] args) {
		Solution10 sol = new Solution10();
		int a = 1; 
		int b = 1;

		long answer = sol.solution(a, b);
		System.out.println(answer);

	}
}

class Solution10 {
    public long solution(int a, int b) {
        long answer = 0;
        if(a != b){
            if(a < b){
                for(int i=a;i<=b;i++){
                    answer = answer + i;
                }
            }else{
                 for(int i=b;i<=a;i++){
                    answer = answer + i;
                }
            }
        }else{
            answer = a;
        }
        return answer;
    }
}