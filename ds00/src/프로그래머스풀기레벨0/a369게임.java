package 프로그래머스풀기레벨0;


public class a369게임 {

	public static void main(String[] args) {
		Solution85 sol = new Solution85();
		int order = 93520423;

		int answer = sol.solution(order);
		System.out.println(answer);

	}
}  

class Solution85 {
	public int solution(int order) {
        int answer = 0;
        String[] arr = (order + "").split("");
        for(int i =0; i<arr.length;i++) {
        	if(Integer.parseInt(arr[i])%3 ==0 && Integer.parseInt(arr[i]) != 0) {
        		answer++;
        	}
        }
        return answer;
    }
}