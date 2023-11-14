package 프로그래머스풀기레벨1_반복;



public class 자연수뒤집업배열로만들기 {

	public static void main(String[] args) {
		Solution8 sol = new Solution8();
		long n = 70;

		int[] answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution8 {
    public int[] solution(long n) {
        String k = Long.toString(n);
        int[] answer = new int[k.length()];
        String[] arr = k.split("");
        for(int i=0;i<arr.length;i++){
            answer[i] = Integer.parseInt(arr[arr.length-1-i]);
        }

        return answer;
    }
}