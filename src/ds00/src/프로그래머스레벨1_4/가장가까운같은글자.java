package 프로그래머스레벨1_4;


public class 가장가까운같은글자 {
	   
}

class Solution38 {
	public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        String[] arr = s.split("");
        
        for(int i=0;i<arr.length;i++){
            answer[i] = -1;
            for(int j=i-1; j>=0;j--){
                if(arr[i].equals(arr[j])){
                    answer[i] = i-j;
                    break;
                }
            }
            System.out.println("       ");     
        }
        return answer;
    }
}