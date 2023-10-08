package 프로그래머스풀기레벨0_1회차반복;



public class 길이에따른연산 {

	public static void main(String[] args) {
		Solution61 sol = new Solution61();
		int[] num_list= {};

		int answer = sol.solution(num_list);
		System.out.println(answer);

	}
}

class Solution61 {
	public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length >=11){
            for(int i=0;i<num_list.length;i++){
                answer = answer + num_list[i];
            }
        }else {
            answer =1;
            for(int i=0;i<num_list.length;i++){
                answer = answer * num_list[i];
            }
        }
        return answer;
    }
}