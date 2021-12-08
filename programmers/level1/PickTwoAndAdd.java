//https://programmers.co.kr/learn/courses/30/lessons/68644
//두 개 뽑아서 더하기
import java.util.*;

class PickTwoAndAdd {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for(int j=i+1; j<numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if (!list.contains(sum)) {
                    list.add(sum);
                }
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}