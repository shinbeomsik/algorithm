package 프로그래머스풀기레벨1_;


public class 추억점수 {

	public static void main(String[] args) {
		Solution44 sol = new Solution44();
		String[] name = {}; 
		int[] yearning  = {};
		String[][] photo = {};

		int[] answer = sol.solution(name, yearning, photo);
		System.out.println(answer);

	} 
}

class Solution44 {
	 public int[] solution(String[] name, int[] yearning, String[][] photo) {
	        int[] answer = new int[photo.length];
	        for(int i=0;i<photo.length;i++){
	            for(int j=0;j<photo[i].length;j++){
	                for(int k=0;k<name.length;k++){
	                    if(photo[i][j].equals(name[k])){
	                        answer[i] = answer[i] + yearning[k];
	                    }    
	                }
	            }
	        }
	        return answer;
	    }
}