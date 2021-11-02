import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//직사각형에서 탈출(1085)
public class Q_1085 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int a = x-0;
        int b = y-0;
        int c = w-x;
        int d = h-y;

        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        System.out.println(arr[0]);

    }


}
/*
    한수는 지금 (x, y)에 있다.
    직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
    직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 x, y, w, h가 주어진다.

    출력
    첫째 줄에 문제의 정답을 출력한다.

    제한
    1 ≤ w, h ≤ 1,000
    1 ≤ x ≤ w-1
    1 ≤ y ≤ h-1
    x, y, w, h는 정수

*/
