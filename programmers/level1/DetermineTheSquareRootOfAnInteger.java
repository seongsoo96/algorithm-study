//https://programmers.co.kr/learn/courses/30/lessons/12934
//정수 제곱근 판별

class DetermineTheSquareRootOfAnInteger {
    public long solution(long n) {
        long answer = 0;

        double a = Math.sqrt(n);
        if(Math.floor(a) == a) {
            answer =  ((long)a + 1) * ((long)a + 1);
        } else {
            answer = -1;
        }
        return answer;
    }
}