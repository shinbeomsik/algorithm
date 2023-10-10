package 프로그래머스풀기레벨0_1회차반복;



public class 순서바꾸기 {

	public static void main(String[] args) {
		Solution101 sol = new Solution101();
		int n = 70;
		int[] num_list = {};
	    int[] answer = sol.solution(num_list, n);
		System.out.println(answer);

	}
}

class Solution101 {
	public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int count = 0;
        for(int i=n ;i<num_list.length;i++){
            answer[count] = num_list[i];
            count++;
        }
        for(int i=0;i<n;i++){
            answer[count] = num_list[i];
            count++;
        }
        
        return answer;
    }
}