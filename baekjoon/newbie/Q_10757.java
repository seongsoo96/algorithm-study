import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

//큰 수 A+B(10757)
public class Q_10757 {

    public static void main(String[] args) throws Exception  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        BigInteger A = new BigInteger(str[0]);
        BigInteger B = new BigInteger(str[1]);

        System.out.println(A.add(B));
    }
}

/*
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)

    출력
    첫째 줄에 A+B를 출력한다.
*/
