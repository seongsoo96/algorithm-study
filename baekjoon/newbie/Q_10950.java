import java.io.BufferedReader;
import java.io.InputStreamReader;

//A+B - 3(10950)
public class Q_10950 {

    public static void main(String[] args) throws Exception  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] ans = new int[T];

        for(int i=0; i<T; i++) {
            String[] str = br.readLine().split(" ");
            ans[i] = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
        }
        for(int i=0; i<T; i++) {
            System.out.println(ans[i]);
        }
    }
}

/*
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 테스트 케이스의 개수 T가 주어진다.
    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
    5
    1 1
    2 3
    3 4
    9 8
    5 2

    출력
    각 테스트 케이스마다 A+B를 출력한다.
    2
    5
    7
    17
    7
*/
