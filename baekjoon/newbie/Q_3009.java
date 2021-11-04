import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//네 번째 점(3009)
public class Q_3009 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());
        int c = Integer.parseInt(st2.nextToken());
        int d = Integer.parseInt(st2.nextToken());
        int e = Integer.parseInt(st3.nextToken());
        int f = Integer.parseInt(st3.nextToken());

        int g, h;

        if(a == c) {
            g = e;
        } else if(c == e) {
            g = a;
        } else {
            g = c;
        }

        if(b == d) {
            h = f;
        } else if(d == f) {
            h = b;
        } else {
            h = d;
        }

        System.out.println(g + " " + h);

    }

}
/*
    세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

    입력
    세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

    출력
    직사각형의 네 번째 점의 좌표를 출력한다.
*/
