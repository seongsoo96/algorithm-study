//https://programmers.co.kr/learn/courses/30/lessons/12937
//짝수와 홀수

class EvenAndOdd {
    public String solution(int num) {
        String answer = "";

        if((num%2 == 0) || (num == 0)){	// num을 2로 나눈 나머지가 0 or num이 0이면
            answer = "Even";			// 짝수
        } else {						// 그 외는
            answer = "Odd";				// 홀수
        }

        return answer;
    }
}