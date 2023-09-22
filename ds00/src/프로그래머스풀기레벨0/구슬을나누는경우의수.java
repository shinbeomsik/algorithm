package 프로그래머스풀기레벨0;


public class 구슬을나누는경우의수 {

	public static void main(String[] args) {
		Solution131 sol = new Solution131();
		int balls = 30; 
		int share = 29;

		int answer = sol.solution(balls, share);
		System.out.println(answer);

	}
}  

class Solution131 {
	public int solution(int balls, int share) {
        int answer = 0;
        double af = 1;
        double bf = 1;
        double cf = 1;
        if(balls != share) {
        for(int i = balls ;i > 0;i--) {
        	af = af*i;
        }
        for(int i =share;i>0;i--) {
        	bf = bf*i;
        }
        for(int i = balls - share ;i >0;i--) {
        	cf = cf*i;
        }
        answer = (int)Math.round(af/(bf*cf));
        }else {
        	answer = 1;
        }
        return answer;
    }
}