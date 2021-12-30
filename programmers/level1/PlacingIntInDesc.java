//https://programmers.co.kr/learn/courses/30/lessons/12933
//정수 내림차순으로 배치하기

import java.util.Arrays;
import java.util.Collections;

class PlacingIntInDesc {
    public long solution(long n) {
        long answer = 0;
        String b = "";

        String a = String.valueOf(n);

        String[] arr = a.split("");
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0; i<arr.length; i++) {
            b += Long.parseLong(arr[i]);
        }
        answer = Long.parseLong(b);

        return answer;
    }
}