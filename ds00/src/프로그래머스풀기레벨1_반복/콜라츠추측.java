package 프로그래머스풀기레벨1_반복;



public class 콜라츠추측 {

	public static void main(String[] args) {
		Solution13 sol = new Solution13();
		long num = 70;

		int answer = sol.solution(num);
		System.out.println(answer);

	}
}

class Solution13 {
    public int solution(long num) {
        int answer = 0;
        int count = 0;
        
        while(num !=1){
            if(num%2==0){
                num = num/2;
            }else {
                num = num*3 + 1;
            }
            count++;
        }
        
        if(count <=500){
            answer = count;
        }else {
            answer = -1;
        }
        return answer;
    }
}