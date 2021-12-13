//https://programmers.co.kr/learn/courses/30/lessons/82612
//부족한 금액 계산하기

class CalculateInsufficient {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long n = 0;
        long m = 0;
        for(int i=1; i<=count; i++) {
            n += price;
            m += n;
        }

        return answer = m > money ? m-money : 0;
    }
}