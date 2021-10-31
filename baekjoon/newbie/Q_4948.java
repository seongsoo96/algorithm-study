import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//베르트랑 공준(4948)
public class Q_4948 {

    public static void main(String[] args) throws Exception  {

        //에라토스테네스의 체 알고리즘 이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                break;
            }
            boolean[] check = new boolean[2*n+1]; //기본값: false
            check[0] = check[1] = true; //<-소수 아닐 때 true, 소수일 때 false
            for(int i=2; i<=2*n; i++) {
                if(check[i] == true) {
                    continue;
                }
                for(int j=i+i; j<=2*n; j=j+i) {
                    check[j] = true;
                }
            }
            int cnt = 0;
            for(int i=n+1; i<=2*n; i++) {
                if(check[i] == false) {
                    cnt++;
                }
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();

        //시간 초과
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        while(true) {
//            int n = Integer.parseInt(br.readLine());
//            if(n == 0) {
//                break;
//            }
//            int primeCnt = 0;
//            for(int i=n+1; i<=2*n; i++) {
//                int cnt = 0;
//                if(i == 1) {
//                    continue;
//                } else {
//                    for(int j=1; j<i+1; j++) {
//                        if(i%j == 0) {
//                            cnt++;
//                        }
//                    }
//                    if(cnt == 2) {
//                        primeCnt++;
//                    }
//                }
//            }
//            bw.write(primeCnt + "\n");
//        }
//        bw.flush();
    }
}

/*
    에라토스테네스의 체 알고리즘 필요
    베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
    이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
    예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19)
    또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
    자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.

    입력
    입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하는 한 줄로 이루어져 있다.
    입력의 마지막에는 0이 주어진다.
    1
    10
    13
    100
    1000
    10000
    100000
    0

    출력
    각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
    1
    4
    3
    21
    135
    1033
    8392


    제한
    1 ≤ n ≤ 123,456
*/
