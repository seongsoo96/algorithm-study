//https://programmers.co.kr/learn/courses/30/lessons/12932
//자연수 뒤집어 배열로 만들기

class FlipNaturalNumbersToFormArray {
    public int[] solution(long n) {
        int[] answer = {};

        String num = String.valueOf(n);

        String[] arr = num.split("");
        for(int i=0; i<arr.length/2; i++) {
            String temp;
            temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = temp;
        }

        answer = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }

        return answer;
    }
}