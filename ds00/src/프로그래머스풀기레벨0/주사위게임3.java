package 프로그래머스풀기레벨0;

import java.util.*;

public class 주사위게임3 {

	public static void main(String[] args) {
		Solution156 sol = new Solution156();
		int a = 2; 
		int b = 5;
		int c = 2;
		int d = 6;

		int answer = sol.solution(a, b, c, d);
		System.out.println(answer);

	}
}  

class Solution156 {
	public int solution(int a, int b, int c, int d) {
        int answer = 1;
        int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        int count = 0;
        List<Integer> brr = new ArrayList<>();
        List<Integer> crr = new ArrayList<>();
        brr.add(arr[0]);
        
        for(int i=1;i<arr.length;i++) {
        	if(arr[i] != brr.get(count)) {
        		brr.add(arr[i]);
        		count++;
        	}else {
        		crr.add(arr[i]);
        	}
        }	
        Collections.sort(brr);
        Collections.sort(crr);
        if(brr.size() == 1) {
        	answer = 1111*brr.get(0);
        }else if(brr.size() ==2 && crr.get(0) == crr.get(1)) {
        	if(brr.get(0) != crr.get(0)) {
        		answer = (10*brr.get(1) + brr.get(0))*(10*brr.get(1) + brr.get(0));
        	}else {
        		answer = (10*brr.get(0) + brr.get(1))*(10*brr.get(0) + brr.get(1));
        	}
        }else if(brr.size() ==2 && crr.get(0) != crr.get(1)) {
        	answer = (brr.get(0) + brr.get(1))*(brr.get(1) - brr.get(0));
        }else if(brr.size() ==3) {
        	for(int i=0;i<brr.size();i++) {
        		if(brr.get(i) == crr.get(0)) {
        			brr.remove(i);
        		}
        	}
        	for(int i=0;i<brr.size();i++) {
        		answer = answer*brr.get(i);
        	}
        }else if(brr.size() ==4) {
        	answer = arr[0];
        }
        
        
        return answer;
    }
}