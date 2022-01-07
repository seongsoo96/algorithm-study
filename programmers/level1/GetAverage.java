//https://programmers.co.kr/learn/courses/30/lessons/12944
//평균 구하기

class GetAverage {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            // 모든 배열 원소들의 합
            sum += arr[i];

            // 평균
            answer = sum / (double)arr.length;
        }

        return answer;
    }
}