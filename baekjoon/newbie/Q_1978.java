import java.io.BufferedReader;
import java.io.InputStreamReader;

//소수 찾기(1978)
public class Q_1978 {

    public static void main(String[] args) throws Exception  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int result = 0;

        for(int i=0; i<N; i++) {
            int a = Integer.parseInt(str[i]);
            int cnt = 0;
            if(a == 1) {
                continue;
            } else {
                for(int j=1; j<=a; j++) {
                    if(a%j == 0) {
                        cnt++;
                    }
                }
            }
            if(cnt == 2) {
                result++;
            }
        }
        System.out.println(result);

    }
}

/*
    주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

    입력
    첫 줄에 수의 개수 N이 주어진다. N은 100이하이다.
    다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
    4
    1 3 5 7

    출력
    주어진 수들 중 소수의 개수를 출력한다.
    3
*/
