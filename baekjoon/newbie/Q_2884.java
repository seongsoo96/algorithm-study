import java.util.Scanner;

//알람 시계
public class Q_2884 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h,m;
        h = sc.nextInt();
        m = sc.nextInt();

        if(m>=45) {
            System.out.print(h + " " + (m-45));
        } else if(m<45) {
            if(h>0) {
                System.out.println((h-1) + " " + (m+15));
            } else {
                System.out.println(23 + " " + (m+15));
            }
        }


    }
}

