package 프로그래머스풀기레벨0_1회차반복;



public class k의개수 {

	public static void main(String[] args) {
		Solution148 sol = new Solution148();
		int i = 1; 
		int j  = 1;
		int k =1;

		int answer = sol.solution(i, j, k);
		System.out.println(answer);

	}
}

class Solution148 {
	public int solution(int i, int j, int k) {
        int answer = 0;
        for(int p = i; p<=j;p++){
            String krr = Integer.toString(p); 
            String[] arr = krr.split("");
            for(int a=0;a<arr.length;a++){
                if(arr[a].equals(Integer.toString(k))){
                    answer++;
                }
            }
        }
        return answer;
    }
}