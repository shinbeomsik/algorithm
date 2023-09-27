
package 프로그래머스풀기레벨1;

import java.util.*;

public class 문자열내마음대로정렬하기 {

	public static void main(String[] args) {
		Solution33 sol = new Solution33();
		String[] strings = { "abce", "abcd", "cdx" };
		int n = 2;

		String[] answer = sol.solution(strings, n);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution33 {
	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];

		Arrays.sort(strings, new Comparator<String>() {

			public int compare(String a, String b) {
				char charA = a.charAt(n);
				char charB = b.charAt(n);
				if (charA == charB) {
					return a.compareTo(b); // 두 문자가 같으면 사전순으로 정렬
				} else {
					return charA - charB; // 두 문자를 비교하여 정렬
				}
			}
		});

		for (int i = 0; i < strings.length; i++) {
			answer[i] = strings[i];
		}

		return answer;
	}
}
//public String[] solution(String[] strings, int n) {
//	String[] answer = new String[strings.length];
//	char[] krr = new char[strings.length];
//	
//	for (int i = 0; i < krr.length; i++) {
//		krr[i] = strings[i].charAt(n);
//	}
//	Arrays.sort(krr);
//	for(int i =0;i<answer.length;i++) {
//		for(int j=0;j<answer.length;j++) {
//			if(strings[i].substring(n, n+1).equals(krr[j] + "")) {
//				answer[i] = strings[j];
//			}
//		}
//	}
//	return answer;
//}