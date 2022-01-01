//https://programmers.co.kr/learn/courses/30/lessons/12935
//제일 작은 수 제거하기

import java.util.ArrayList;

class RemoveSmallestNum {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != min) {
                list.add(arr[i]);
            }
        }

        if(list.size() == 0) {
            answer = new int[]{-1};
        } else {
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}