//https://programmers.co.kr/learn/courses/30/lessons/12912
//두 정수 사이의 합

class SumBetweenTwoIntegers {
    public long solution(int a, int b) {
        long answer = 0;

        int leng = Math.abs(a-b) + 1;
        int[] arr = new int[leng];

        for(int i=0; i<arr.length; i++) {
            if(b>a) {
                arr[i] = i+a;
                answer += arr[i];
            } else if(a>b) {
                arr[i] = i+b;
                answer += arr[i];
            } else if (a==b) {
                answer = a;
            }
        }

        return answer;
    }
}