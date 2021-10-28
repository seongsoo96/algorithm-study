import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//소인수분해(11653)
public class Q_11653 {

    public static void main(String[] args) throws Exception  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int a = 2;

        while(true) {
            if(n == 1) {
                break;
            }
            if(n%a == 0) {
                n = n/a;
                bw.write(a + "\n");
                if(n == 1) {
                    break;
                }
            } else {
                a++;
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}

/*
    정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

    입력
    첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.
    72

    출력
    N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
    2
    2
    2
    3
    3
*/
