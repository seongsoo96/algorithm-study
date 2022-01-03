//https://programmers.co.kr/learn/courses/30/lessons/129340
//최대공약수와 최소공배수

class GCDAndLCM {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        //두수의 크기 정렬
        int big,small;

        if(n>m){
            big = n; small = m;
        } else {
            big = m; small = n;
        }

        answer[0] = gcd(big,small);
        answer[1] = big*small/answer[0];

        return answer;
    }
    //유클리드 호제법
    public int gcd(int a,int b){
        if(a % b == 0) {
            return b;
        }
        return gcd(b,a%b);
    }
}