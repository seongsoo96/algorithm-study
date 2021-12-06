//https://programmers.co.kr/learn/courses/30/lessons/42748
//k번째수

import java.util.*;

class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>(array.length);
            for(int j : array) {
                arrayList.add(j);
            }

            int j = commands[i][1];
            while(j > commands[i][1]-1 && j <= arrayList.size()-1) {
                arrayList.remove(j);
            }

            for(int k=0; k<commands[i][0]-1; k++) {
                arrayList.remove(0);
            }

            Collections.sort(arrayList);
            answer[i] = arrayList.get(commands[i][2]-1);
        }

        return answer;
    }
}