package 프로그래머스풀기레벨1_반복;



public class 나머지가1이되는수찾기 {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int n = 70;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution3 {
    public int solution(int n) {
        int answer = 0;
        int count =1;
        
        while(n%count !=1){
            count++;
        }
        answer = count;
        return answer;
    }
}