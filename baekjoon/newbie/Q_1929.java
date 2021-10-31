import java.beans.beancontext.BeanContext;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//소수 구하기(1929)
public class Q_1929 {

    public static void main(String[] args) throws Exception  {

        //에라토스테네스의 체 알고리즘 이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] check = new boolean[n+1];

        check[0] = check[1] = true;

        for(int i=2; i<=n; i++) {
            if(check[i] == true) {
                continue;
            }
            for(int j=i+i; j<=n; j=j+i) {
                check[j] = true;
            }
        }
        for(int i=m; i<=n; i++) {
            if(check[i] == false) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();

        //시간 초과 풀이
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int m = Integer.parseInt(st.nextToken());
//        int n = Integer.parseInt(st.nextToken());
//
//        for(int i=m; i<n+1; i++) {
//            int cnt = 0;
//            if(i == 1) {
//                continue;
//            } else {
//                for(int j=1; j<i+1; j++) {
//                    if(i%j == 0) {
//                        cnt++;
//                    }
//                }
//                if(cnt == 2) {
//                    bw.write(i + "\n");
//                }
//            }
//        }
//        bw.flush();
//        bw.close();
//        br.close();

    }
}

/*
    M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다.
    (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
    3 16

    출력
    한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
    3
    5
    7
    11
    13
*/
