
package 프로그래머스풀기레벨0;

public class 이어붙인수 {

	public static void main(String[] args) {
		Solution38 sol = new Solution38();
		int[] num_list = {3, 4, 5, 2, 1};

		int answer = sol.solution(num_list);
		System.out.println(answer);
	}
}

class Solution38 {
	public int solution(int[] num_list) {
        int answer = 0;
        String a = "";
        String b = "";
        for(int i =0; i<num_list.length;i++) {
        	if(num_list[i]%2==0) {
        		a =a + num_list[i];
        	}else if(num_list[i]%2==1) {
        		b =b + num_list[i];
        	}
        }
        answer = Integer.parseInt(a)+ Integer.parseInt(b);
        return answer;
    }
}  