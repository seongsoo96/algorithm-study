//https://programmers.co.kr/learn/courses/30/lessons/77484

package level1;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zero_cnt = 0;
        for(int i=0; i<lottos.length; i++) {
            if(lottos[i] == 0) {
                zero_cnt++;
                continue;
            }
            for(int j=0; j<win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    cnt++;
                    break;
                }
            }
        }
        answer[0] = 7-cnt-zero_cnt;
        answer[1] = 7-cnt;

        if(answer[0]>6) {
            answer[0] = 6;
        }
        if(answer[1]>6) {
            answer[1] = 6;
        }
        return answer;
    }
}