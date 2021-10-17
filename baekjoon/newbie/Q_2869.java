import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//달팽이는 올라가고 싶다(2869)
public class Q_2869 {

    public static void main(String[] args) throws Exception  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 높이
        int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 높이
        int V = Integer.parseInt(st.nextToken()); // 정상 높이

        int day = (V - B) / (A - B); //-> V-B(꼭대기에 올라가면 더이상 미끄러지지 않는다.)
        if((V - B) % (A - B) != 0){
            day++;
        }
        System.out.println(day);

    }
}

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
