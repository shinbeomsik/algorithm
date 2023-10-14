package 프로그래머스풀기레벨0_1회차반복;



public class 숫자찾기 {

	public static void main(String[] args) {
		Solution129 sol = new Solution129();
		int num = 5;
		int k = 70;

		int answer = sol.solution(num, k);
		System.out.println(answer);

	}
}

class Solution129 {
	 public int solution(int num, int k) {
	        int answer = -1;
	        String sNum = Integer.toString(num);
	        String sK = Integer.toString(k);
	        String[] arr = sNum.split("");
	        
	        for(int i=0;i<arr.length;i++){
	            if(arr[i].equals(sK)){
	                answer = i+1;
	                break;
	            }
	        }
	        return answer;
	    }
}