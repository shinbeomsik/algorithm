package 프로그래머스레벨1_반복;

import java.util.*;
public class 바탕화면정리 {
	
}

class Solution61 {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        List<Integer> arr = new ArrayList<>();
        List<Integer> brr = new ArrayList<>();
        List<Integer> crr = new ArrayList<>();
        for(int i=0; i<wallpaper.length; i++){
            if(wallpaper[i].contains("#")){
                arr.add(i);
                brr.add(wallpaper[i].indexOf("#"));
                crr.add(wallpaper[i].lastIndexOf("#"));
            }
        }
        Collections.sort(arr);
        Collections.sort(brr);
        Collections.sort(crr);
        answer[0] = arr.get(0);
        answer[1] = brr.get(0);
        answer[2] = arr.get(arr.size()-1) + 1;
        answer[3] = crr.get(crr.size()-1) + 1;
        return answer;
    }
}