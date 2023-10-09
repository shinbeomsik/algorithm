package 프로그래머스풀기레벨0_1회차반복;



public class 배열의길이에따라다른연산하기 {

	public static void main(String[] args) {
		Solution96 sol = new Solution96();
		int n = 70;
		int[] arr = {};
		int[] answer = sol.solution(arr, n);
		System.out.println(answer);

	}
}

class Solution96 {
	public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            if(arr.length%2==0){
                if(i%2==0){
                    answer[i] = arr[i];
                }else{
                    answer[i] = arr[i] + n;
                }
            }else{
                if(i%2 !=0){
                    answer[i] = arr[i];
                }else{
                    answer[i] = arr[i] + n;
                }
            }
        }
        
        return answer;
    }
}