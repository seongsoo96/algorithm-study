import java.io.BufferedReader;
import java.io.InputStreamReader;

//분수찾기(1193)
public class Q_1193 {

    public static void main(String[] args) throws Exception  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int line = 0;
        int line_seq = 0;
        int cnt = 0;
        while(cnt<X) {
            line++;
            line_seq = 0;
            for(int i=0; i<line; i++) {
                cnt++;
                line_seq++;
                if(cnt==X) {
                    break;
                }
            }
        }
        int first = 0;
        int last = 0;
        for(int i=1; i<=line_seq; i++) {
            if(line%2==0) {
                first = i;
                last = line+1-i;
            } else {
                first = line+1-i;
                last = i;
            }
        }
        System.out.println(first + "/" + last);
    }
}

/*
    무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
    1/1	1/2	1/3	1/4	1/5	…
    2/1	2/2	2/3	2/4	…	…
    3/1	3/2	3/3	…	…	…
    4/1	4/2	…	…	…	…
    5/1	…	…	…	…	…
    …	…	…	…	…	…
    이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로
    차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
    X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.

    출력
    첫째 줄에 분수를 출력한다.
*/
