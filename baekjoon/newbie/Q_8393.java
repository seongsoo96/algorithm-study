import java.io.BufferedReader;
import java.io.InputStreamReader;

//합(8393)
public class Q_8393 {

    public static void main(String[] args) throws Exception  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}

/*
    n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
    3

    출력
    1부터 n까지 합을 출력한다.
    6
*/
