//https://programmers.co.kr/learn/courses/30/lessons/12982
//예산
import java.util.Arrays;

class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++) {
            sum += d[i];
            if(sum > budget) {
                break;
            }
            answer++;
        }
        return answer;
    }
}