package 프로그래머스풀기레벨0;

import java.util.*;

public class 다항식더하기 {

	public static void main(String[] args) {
		Solution149 sol = new Solution149();
		String polynomial = "55x + x + 55x + 1 + 2x + 3x";

		String answer = sol.solution(polynomial);
		System.out.println(answer);

	}
}

class Solution149 {
	public String solution(String polynomial) {
		String answer = "";
		String[] arr = polynomial.split(" ");

		List<String> xarr = new ArrayList<>();
		List<String> intarr = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("x")) {
				xarr.add(arr[i]);
			} else if (arr[i].equals("+")) {
				
			} else {
				intarr.add(arr[i]);
			}
		}
		int xcount = 0;
		for (int i = 0; i < xarr.size(); i++) {
			if (xarr.get(i).length() != 1) {
				xcount = xcount + Integer.parseInt(xarr.get(i).substring(0, xarr.get(i).length() - 1));
			} else {
				xcount = xcount + 1;
			}
		}

		int count = 0;
		for (int i = 0; i < intarr.size(); i++) {
			count = count + Integer.parseInt(intarr.get(i));
		}

		if (xcount != 1 && xcount != 0 && count != 0) {
			answer = xcount + "x" + " + " + count;
		} else if (xcount != 1 && xcount != 0 && count == 0) {
			answer = xcount + "x";
		} else if (xcount == 0 && count != 0) {
			answer = count + "";
		} else if (xcount == 1 && count == 0) {
			answer = "x";
		} else if (xcount == 1 && count != 0) {
			answer = "x" + " + " + count;
		}

		return answer;
	}
}