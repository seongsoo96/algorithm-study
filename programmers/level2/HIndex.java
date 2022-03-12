//https://programmers.co.kr/learn/courses/30/lessons/42747
//H-Index
import java.util.*;

public class HIndex {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++) {
            if (arr[i] >= arr.length-i) {
                answer = arr.length-i;
                break;
            }
        }

        return answer;
    }
}
