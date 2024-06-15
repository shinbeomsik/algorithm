package 프로그래머스레벨1_1;

import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {
	
}

class Solution64 {
	public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String s : callings) {
            int cur = map.get(s);
            map.put(s, cur - 1);
            map.put(players[cur - 1], cur);
            players[cur] = players[cur - 1];
            players[cur - 1] = s;
        }

        return players;
    }
}



/*
 * 이건 가능하긴 해도 속도에서 실패함 class Solution { public String[] solution(String[]
 * players, String[] callings) { String[] answer = players;
 * 
 * for (int i = 0; i < callings.length; i++) { for (int j = 0; j <
 * players.length; j++) { if (callings[i].equals(players[j])) { String a =
 * players[j - 1]; players[j - 1] = players[j]; players[j] = a; break; } } }
 * return answer; } }
 */
 
