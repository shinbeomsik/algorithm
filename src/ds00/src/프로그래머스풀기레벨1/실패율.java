package 프로그래머스풀기레벨1;

import java.util.*;

public class 실패율 {

	public static void main(String[] args) {
		Solution50 sol = new Solution50();
		int N = 2;
		int[] stages = {1,1,1,1};

		int[] answer = sol.solution(N, stages);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution50 {
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N]; // 스테이지
        double[] fail = new double[N]; // 실패율
        int noclear[] = new int[N]; // 해당 스테이지(-1)를 클리어하지 못한 사용자 수

        for(int s : stages){
            if(s != N+1) noclear[s-1] += 1;
        }        
        
        // 실패율 구하기
        int player=stages.length;// 초기사용자 = stages.length
        for(int i=0; i<N; i++){
            fail[i]= (double)noclear[i]/player; // 실패율 저장
            player -= noclear[i];
            answer[i]=i+1;
        }
        
        double tmpf=0;
        int tmpa =0;
        // 실패율 정렬하면서 answer의 스테이지도 함께 순서바꿈
        for(int i = 0; i < N; i++){
            for (int j = 1; j < N - i; j++) {
                if(fail[j-1]<fail[j]){  // 가장 작은 수(맨뒤)부터 정렬
                    tmpf=fail[j-1];
                    fail[j-1]=fail[j];
                    fail[j]=tmpf;
                    
                    tmpa=answer[j-1];
                    answer[j-1]=answer[j];
                    answer[j]=tmpa;
                }
            }
        }

        return answer;
    }
}
//public int[] solution(int N, int[] stages) {
//	int[] answer = new int[N];
//	double[] fail = new double[N];
//	double[] fail2 = new double[N];
//	int[] arr = new int[N + 1];
//	
//	for (int i = 0; i < stages.length; i++) {
//		arr[stages[i] - 1]++;
//	}
//	int human = stages.length;
//	for (int i = 0; i < fail.length; i++) {
//		fail[i] = (double) arr[i] / (double) human;
//		fail2[i] = (double) arr[i] / (double) human;
//		human = human - arr[i];
//	}
//	
//	boolean changesMade = true; // 변경 사항이 있는지 여부를 확인하기 위한 플래그
//	
//	while (changesMade) {
//		changesMade = false; // 초기에 변경 사항이 없다고 가정
//		for (int i = 0; i < fail.length; i++) {
//			for (int j = i + 1; j < fail.length; j++) {
//				if (fail[i] == fail[j]) {
//					if (fail[i] != 0) {
//						fail[j-1] = fail[j-1] + 0.001;
//						fail2[j-1] = fail2[j-1] + 0.001;
//						changesMade = true; // 변경 사항이 있음을 표시
//					}else {
//						fail[j] = fail[j] - 0.002;
//						fail2[j] = fail2[j] - 0.002;
//						changesMade = true; // 변경 사항이 있음을 표시
//					}
//				}
//			}
//		}
//	}
//	
//	System.out.println(Arrays.toString(fail));
//	
//	Arrays.sort(fail);
//	System.out.println(Arrays.toString(fail));
//	System.out.println(Arrays.toString(fail2));
//	
//	for (int i = 0; i < fail.length; i++) {
//		for (int j = 0; j < fail2.length; j++) {
//			if (fail[i] == fail2[j]) {
//				answer[N - i - 1] = j + 1;
//			}
//		}
//	}
//	return answer;
//}