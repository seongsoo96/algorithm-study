//https://programmers.co.kr/learn/courses/30/lessons/12947
//하샤드 수

class HarshadNumber {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = sum(x);

        if(x%sum != 0) {
            answer = false;
        }

        return answer;
    }

    public int sum(int x) {
        int a = 0;
        while(true) {
            a += x%10;
            x /= 10;
            if(x == 0) {
                break;
            }
        }
        return a;
    }
}