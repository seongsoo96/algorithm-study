import java.util.Scanner;

//X보다 작은 수
public class Q_10871 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        int[] arr2;

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();

            if(arr[i]<x) {
                System.out.print(arr[i]);
                System.out.print(" ");
            }
        }

    }
}

