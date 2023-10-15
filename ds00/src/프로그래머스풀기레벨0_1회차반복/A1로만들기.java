package 프로그래머스풀기레벨0_1회차반복;



public class A1로만들기 {

	public static void main(String[] args) {
		Solution149 sol = new Solution149();
		int[] num_list = {};

		int answer = sol.solution(num_list);
		System.out.println(answer);

	}
}

class Solution149 {
	public int solution(int[] num_list) {
        int answer = 0;
        for(int i=0;i<num_list.length;i++){
            while(num_list[i] != 1){
                if(num_list[i]%2==0){
                    num_list[i] = num_list[i]/2;
                }else{
                    num_list[i] = (num_list[i]-1)/2;
                }
                answer++;
            }
        }
        return answer;
    }
}