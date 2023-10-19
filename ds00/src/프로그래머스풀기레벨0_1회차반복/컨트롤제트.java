package 프로그래머스풀기레벨0_1회차반복;



public class 컨트롤제트 {

	public static void main(String[] args) {
		Solution158 sol = new Solution158();
		String s = "";

		int answer = sol.solution(s);
		System.out.println(answer);

	}
}

class Solution158 {
	public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("Z")){
                answer  = answer - Integer.parseInt(arr[i-1]);
            }else{
                answer = answer + Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}