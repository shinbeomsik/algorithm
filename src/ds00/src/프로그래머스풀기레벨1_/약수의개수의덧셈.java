package 프로그래머스풀기레벨1_1회차반복;



public class 약수의개수의덧셈 {

	public static void main(String[] args) {
		Solution24 sol = new Solution24();
		int left = 1; 
		int right = 1;

		int answer = sol.solution(left, right);
		System.out.println(answer);
	} 
}

class Solution24 {
	public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i<=right;i++){
            int a = 0;
            for(int j=1; j<=i;j++){
                if(i%j ==0){
                    a++;
                }
            }
             if(a %2 ==0){
                    answer = answer + i;
                }else {
                    answer = answer - i;
                }
        }
        return answer;
    }
}