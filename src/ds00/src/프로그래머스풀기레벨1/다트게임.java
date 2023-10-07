package 프로그래머스풀기레벨1;

public class 다트게임 {

	public static void main(String[] args) {
		Solution51 sol = new Solution51();
		String dartResult = "1D2S3T*";

		System.out.println(1 * 2 + 2 * 2 + (3 * 3 * 3) * 2);
		int answer = sol.solution(dartResult);
		System.out.println(answer);

	}
}

class Solution51 {
	public int solution(String dartResult) {
		int answer = 0;
		double result = 0;
		String[] arr = dartResult.split("");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].matches("[0-9]")) {
				if (arr[i + 1].equals("S")) {
					if (i + 2 < arr.length && arr[i + 2].equals("#")) {
						result = result - Math.pow(Double.parseDouble(arr[i]), 1);
					} else {
						result = result + Math.pow(Double.parseDouble(arr[i]), 1);
					}
				} else if (arr[i + 1].equals("D")) {
					if (i + 2 < arr.length && arr[i + 2].equals("#")) {
						result = result - Math.pow(Double.parseDouble(arr[i]), 2);
					} else {
						result = result + Math.pow(Double.parseDouble(arr[i]), 2);
					}
				} else if (arr[i + 1].equals("T")) {
					if (i + 2 < arr.length && arr[i + 2].equals("#")) {
						result = result - Math.pow(Double.parseDouble(arr[i]), 3);
					} else {
						result = result + Math.pow(Double.parseDouble(arr[i]), 3);
					}
				}

				if (i + 2 < arr.length && arr[i + 2].equals("*")) {
					result = result * 2;
				}
			}

			if (arr[i].equals("1") && arr[i + 1].equals("0")) {
				String k = arr[i] + arr[i + 1];
				if (arr[i + 2].equals("S")) {
					if (i + 3 < arr.length && arr[i + 3].equals("#")) {
						result = result - Math.pow(Double.parseDouble(k), 1);
					} else {
						result = result + Math.pow(Double.parseDouble(k), 1);
					}
				} else if (arr[i + 2].equals("D")) {
					if (i + 3 < arr.length && arr[i + 3].equals("#")) {
						result = result - Math.pow(Double.parseDouble(k), 2);
					} else {
						result = result + Math.pow(Double.parseDouble(k), 2);
					}
				} else if (arr[i + 2].equals("T")) {
					if (i + 3 < arr.length && arr[i + 3].equals("#")) {
						result = result - Math.pow(Double.parseDouble(k), 3);
					} else {
						result = result + Math.pow(Double.parseDouble(k), 3);
					}
				}

				if (i + 3 < arr.length && arr[i + 3].equals("*")) {
					result = result * 2;
				}
			}
		}

		answer = (int) result;
		return answer;
	}
}


//class Solution51 {
//    public int solution(String dartResult) {
//        int answer = 0;
//        
//        String temp = ""; // 문자열 내 1번의 점수 저장 변수
//        int arr[] = new int[3]; // 3번의 점수를 저장할 배열
//        int idx = 0; // 배열을 참조하기 위한 idx
//        
//        // 1. dartResult 문자열 탐색.
//        for(int i = 0;i<dartResult.length();i++){
//            // 1-1. 문자열의 각 문자에 따라 조건 처리.
//            switch(dartResult.charAt(i)){
//                // 1-2. *인 경우는 자신과 이전의 점수 *2, idx는 S,D,T 처리 후 증가하기 때문에 idx-1, idx-2 후 *2    
//                case '*':
//                    arr[idx-1]*=2;
//                    if(idx >1) arr[idx-2]*=2;
//                    break;
//                // 1-3. #은 자신의 점수를 음수로 만든다.                 
//                case '#':
//                    arr[idx-1]*=-1;
//                    break;
//                // 1-4. S는 1제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화.    
//                case 'S':
//                    arr[idx] = (int)Math.pow(Integer.parseInt(temp),1);
//                    idx++;
//                    temp ="";
//                    break;
//                // 1-5. D는 2제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화.    
//                case 'D':
//                    arr[idx] = (int)Math.pow(Integer.parseInt(temp),2);
//                    idx++;
//                    temp ="";
//                    break;
//                // 1-6. T는 3제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화.                   
//                case 'T':
//                    arr[idx] = (int)Math.pow(Integer.parseInt(temp),3);
//                    idx++;
//                    temp ="";
//                    break;
//                // 1-7. 그 외의 정수들은 temp 변수에 저장해 둔다.    
//                default:
//                    temp+=String.valueOf(dartResult.charAt(i));
//                    break;                    
//            } 
//        }
//        
//        // 2. 위 과정을 통해 구한 각 횟수의 점수를 모두 더하면 정답.
//        for(int i =0;i<arr.length;i++){
//            answer+=arr[i];
//        }
//        
//        return answer;
//    }
//}