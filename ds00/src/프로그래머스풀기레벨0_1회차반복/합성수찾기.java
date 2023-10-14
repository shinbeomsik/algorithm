package 프로그래머스풀기레벨0_1회차반복;



public class 합성수찾기 {

	public static void main(String[] args) {
		Solution132 sol = new Solution132();
		int n = 70;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution132 {
	public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            int k=0;
            for(int j=1;j<=i;j++){
                if(i%j ==0){
                    k++;
                    if(k==3){
                        break;
                    }
                }
            }
            if(k>=3){
                answer++;
            }
        }
        return answer;
    }
}