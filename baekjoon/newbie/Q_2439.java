import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//별 찍기 - 2(2439)
public class Q_2439 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++) {
            for(int j=0; j<n-i; j++) {
                sb.append(" ");
            }
            for(int j=0; j<i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
/*
    첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
    하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

    입력
    첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
    5

    출력
    첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
        *
       **
      ***
     ****
    *****
*/
