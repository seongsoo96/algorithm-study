//https://programmers.co.kr/learn/courses/30/lessons/42584
//주식 가격
public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i=0; i<answer.length; i++) {
            answer[i] = 0;
            for(int j=i+1; j<answer.length; j++) {
                if(prices[i] <= prices[j]) {
                    answer[i]++;
                } else {
                    answer[i]++;
                    break;
                }
            }
        }

        return answer;
    }
}
