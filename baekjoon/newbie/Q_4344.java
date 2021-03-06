import java.io.BufferedReader;
import java.io.InputStreamReader;

//평균은 넘겠지(4344)
public class Q_4344 {

    public static void main(String[] args) throws Exception  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        String[] ans = new String[C];

        for(int i=0; i<C; i++) {
            String[] str = br.readLine().split(" ");
            int N = Integer.parseInt(str[0]);
            double sum = 0;
            double avg = 0;
            int overAvgCnt = 0;
            for(int j=1; j<=N; j++) {
                sum += Double.parseDouble(str[j]);
                avg = sum/N;
            }
            for(int j=1; j<=N; j++) {
                if(Double.parseDouble(str[j]) > avg) {
                    overAvgCnt++;
                }
            }
            ans[i] = String.format("%.3f", (double)overAvgCnt/N*100) + "%";
        }

        for(int i=0; i<C; i++) {
            System.out.println(ans[i]);
        }

    }
}

/*
    대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다.
    당신은 그들에게 슬픈 진실을 알려줘야 한다.

    입력
    첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
    둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
    이어서 N명의 점수가 주어진다.
    점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
    5
    5 50 50 70 80 100
    7 100 95 90 80 70 60 50
    3 70 90 80
    3 70 90 81
    9 100 99 98 97 96 95 94 93 91

    출력
    각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
    40.000%
    57.143%
    33.333%
    66.667%
    55.556%
*/
