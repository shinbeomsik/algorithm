package 프로그래머스풀기레벨1_반복;



public class 음양더하기 {

	public static void main(String[] args) {
		Solution14 sol = new Solution14();
		int[] absolutes = {};
		
		boolean[] signs = {};

		int answer = sol.solution(absolutes, signs);
		System.out.println(answer);

	}
}

class Solution14 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0;i<signs.length;i++){
            if(signs[i]){
                answer = answer + absolutes[i];
            }else{
                answer = answer - absolutes[i];
            }
        }
        return answer;
    }
}