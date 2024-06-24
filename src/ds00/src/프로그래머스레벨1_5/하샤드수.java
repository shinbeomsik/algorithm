package ds00.src.프로그래머스레벨1_5;

class 하샤드수 {
	class Solution {
		public boolean solution(int x) {
			boolean answer = true;
			String k = Integer.toString(x);

			String[] arr = k.split("");

			int total = 0;
			for(int i=0; i<arr.length; i++){
				total = total + Integer.parseInt(arr[i]);
			}

			if(x % total !=0){
				answer =false;
			}
			return answer;
		}
	}
}