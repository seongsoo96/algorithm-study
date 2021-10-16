import java.io.BufferedReader;
import java.io.InputStreamReader;

//달팽이는 올라가고 싶다(2869)
public class Q_2869 {

    public static void main(String[] args) throws Exception  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int V = Integer.parseInt(str[2]);
        int day = 1;
        int meter = 0;

        while(meter < V) {
            meter += A;
            if(meter >= V) {
                System.out.println(day);
                break;
            } else {
                meter -= B;
                day++;
            }
        }

    }
}
//답은 맞는데 시간초과 떠서 당황... 좀 더 연구해봐야 할 듯. 아마 반복문이 문제일듯.
//토크나이저도 생각해봐야함.

/*
    땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
    달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다.
    또, 정상에 올라간 후에는 미끄러지지 않는다.
    달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
    2 1 5  //5 1 6  //100 99 1000000000

    출력
    첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
    4      //2      //999999901
*/
