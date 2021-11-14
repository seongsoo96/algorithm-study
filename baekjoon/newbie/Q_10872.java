import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//팩토리얼(10872)
public class Q_10872 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int ans = 1;
        for(int i=1; i<=n; i++) {
            ans *= i;
        }
        System.out.println(ans);
    }
}
/*
    0보다 크거나 같은 정수 N이 주어진다.
    이때, N!을 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
    10

    출력
    첫째 줄에 N!을 출력한다.
    3628800
*/
