package 프로그래머스레벨1_1;
import java.util.*;

public class 햄버검만들기 {
	
}

class Solution59 {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int in : ingredient){
            arr.add(in);
            if(arr.size() >= 4){
                if(arr.get(arr.size()-1) ==1 && arr.get(arr.size()-2) ==3 && arr.get(arr.size()-3) == 2 && arr.get(arr.size()-4) ==1 ){
                    answer++;
                    arr.remove(arr.size()-4);
                    arr.remove(arr.size()-3);
                    arr.remove(arr.size()-2);
                    arr.remove(arr.size()-1);
                }
            }
        }
        return answer;
    }
}