package ds00.src.프로그래머스레벨1_5;
import java.util.*;
class 나누어떨어지는숫자배열 {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		int count = 0;
		List<Integer> brr = new ArrayList<>();

		for(int i=0; i<arr.length; i++){
			if(arr[i] % divisor ==0){
				count++;
				brr.add(i);
			}
		}

		if(count == 0){
			answer = new int[1];
			answer[0] = -1;
		}else{
			answer = new int[count];
			for(int i=0;i<answer.length;i++){
				answer[i] = arr[brr.get(i)];
			}

			Arrays.sort(answer);
		}


		return answer;
	}
}