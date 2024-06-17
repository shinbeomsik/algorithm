package 프로그래머스레벨1_4;


public class 추억점수 {
	   
}

class Solution43 {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i=0; i<photo.length;i++){
            for(int j=0; j<photo[i].length;j++){
                for(int k=0; k<name.length; k++){
                    if(photo[i][j].equals(name[k])){
                        answer[i] = answer[i] + yearning[k];
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}