//https://programmers.co.kr/learn/courses/30/lessons/12931
//자릿수 더하기

class AddDigits {
    public int solution(int n) {
        int answer = 0;

        String[] num = String.valueOf(n).split("");
        for (String a : num) {
            answer += Integer.parseInt(a);
        }

        return answer;
    }
}