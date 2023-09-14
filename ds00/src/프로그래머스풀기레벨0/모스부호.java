package 프로그래머스풀기레벨0;


public class 모스부호 {

	public static void main(String[] args) {
		Solution95 sol = new Solution95();
		String letter = ".--. -.-- - .... --- -.";

		String answer = sol.solution(letter);
		System.out.println(answer);

	}
}

class Solution95 {
	public String solution(String letter) {
		String answer = "";
		String[] arr = letter.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(".-")) {
				answer = answer + "a";
			} else if (arr[i].equals("-...")) {
				answer = answer + "b";
			} else if (arr[i].equals("-.-.")) {
				answer = answer + "c";
			} else if (arr[i].equals("-..")) {
				answer = answer + "d";
			} else if (arr[i].equals(".")) {
				answer = answer + "e";
			} else if (arr[i].equals("..-.")) {
				answer = answer + "f";
			} else if (arr[i].equals("--.")) {
				answer = answer + "g";
			} else if (arr[i].equals("....")) {
				answer = answer + "h";
			} else if (arr[i].equals("..")) {
				answer = answer + "i";
			} else if (arr[i].equals(".---")) {
				answer = answer + "j";
			} else if (arr[i].equals("-.-")) {
				answer = answer + "k";
			} else if (arr[i].equals(".-..")) {
				answer = answer + "l";
			} else if (arr[i].equals("--")) {
				answer = answer + "m";
			} else if (arr[i].equals("-.")) {
				answer = answer + "n";
			} else if (arr[i].equals("---")) {
				answer = answer + "o";
			} else if (arr[i].equals(".--.")) {
				answer = answer + "p";
			} else if (arr[i].equals("--.-")) {
				answer = answer + "q";
			} else if (arr[i].equals(".-.")) {
				answer = answer + "r";
			} else if (arr[i].equals("...")) {
				answer = answer + "s";
			} else if (arr[i].equals("-")) {
				answer = answer + "t";
			} else if (arr[i].equals("..-")) {
				answer = answer + "u";
			} else if (arr[i].equals("...-")) {
				answer = answer + "v";
			} else if (arr[i].equals(".--")) {
				answer = answer + "w";
			} else if (arr[i].equals("-..-")) {
				answer = answer + "x";
			} else if (arr[i].equals("-.--")) {
				answer = answer + "y";
			} else if (arr[i].equals("--..")) {
				answer = answer + "z";
			}
		}
		return answer;
	}
}