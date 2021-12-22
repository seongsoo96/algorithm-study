//https://programmers.co.kr/learn/courses/30/lessons/12921
//소수 찾기

class FindPrimeNum {
    public int solution(int n) {
        int answer = 0;
        boolean[] check = new boolean[n+1];

        check[0] = check[1] = true;

        for(int i=2; i<=n; i++) {           //2~n까지 반복
            if(check[i] == true) {          //true이면 소수가 아님. continue;
                continue;
            }
            for(int j=i+i; j<=n; j=j+i) {   //각 소수의 배수에 true를 대입.
                check[j] = true;
            }
        }
        for(int i=1; i<=n; i++) {           //1~n까지
            if(check[i] == false) {         //check[i]가 소수일 때
                answer++;
            }
        }

        return answer;
    }
}