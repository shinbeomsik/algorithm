package ds00.src.프로그래머스레벨1_5;
import java.util.*;
class 제일작은수제거하기 {
	public int[] solution(int[] arr) {
		int[] answer = {};

		if(arr.length ==1){
			answer = new int[1];
			answer[0] = -1;
		}else{
			answer = new int[arr.length-1];

			int low = arr[0];

			for(int i=1; i<arr.length; i++){
				if(low > arr[i]){
					low = arr[i];
				}
			}

			int j =0;
			for(int i=0; i<arr.length; i++){
				if (arr[i] != low) {
					answer[j++] = arr[i];
				}
			}
		}
		return answer;
	}
}