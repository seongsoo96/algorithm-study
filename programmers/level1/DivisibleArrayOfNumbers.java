//https://programmers.co.kr/learn/courses/30/lessons/12910
//나누어 떨어지는 숫자 배열

import java.util.ArrayList;
import java.util.Arrays;

class DivisibleArrayOfNumbers {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor == 0) {
                list.add(arr[i]);
            }
        }
        if(list.size() > 0) {
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
        } else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}