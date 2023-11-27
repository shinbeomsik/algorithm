package 프로그래머스레벨1_반복;


public class 추억점수 {
	
}

class Solution39 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i=0;i<photo.length;i++){
            for(int j=0;j<photo[i].length;j++){
                int count =0;
                while(count !=name.length){
                    if(photo[i][j].equals(name[count])){
                        answer[i] = answer[i] + yearning[count];
                    }
                    count++;
                }
            }
        }
        return answer;
    }
}