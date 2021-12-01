//https://programmers.co.kr/learn/courses/30/lessons/86051
//없는 숫자 더하기
class AddMissingNumbers {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<10; j++) {
                if(numbers[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }

        for(int i=0; i<10; i++) {
            answer += arr[i];
        }

        return answer;
    }
}