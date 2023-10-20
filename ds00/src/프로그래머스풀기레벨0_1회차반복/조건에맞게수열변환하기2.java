package 프로그래머스풀기레벨0_1회차반복;



public class 조건에맞게수열변환하기2 {

	public static void main(String[] args) {
		Solution166 sol = new Solution166();
		int[] arr = {};

		int answer = sol.solution(arr);
		System.out.println(answer);

	}
}

class Solution166 {
	public int solution(int[] arr) {
        int answer = -1;
        int k=0;
        
        while(k != arr.length){
            k=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i] >= 50 && arr[i]%2 ==0){
                    arr[i] = arr[i]/2;
                }else if(arr[i] < 50 && arr[i]%2 ==1){
                    arr[i] = arr[i] *2 +1;
                }else{
                    k++;
                }
            }
            
            answer++;
        }
        return answer;
    }
}