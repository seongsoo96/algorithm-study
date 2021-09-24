import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//최댓값
public class Q_2562 {

    public static void main(String[] args) throws IOException {

        // 정답
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int max = 0;
        int cnt = 0;
        for(int i=0; i<9; i++) {
            String a = br.readLine();
            arr[i] = Integer.parseInt(a);
        }
        for(int i=0; i<9; i++) {
            if(arr[i]>max) {
                max = arr[i];
                cnt = i+1;
            }
        }
        System.out.println(max);
        System.out.println(cnt);

/*
        틀린 풀이.

        int[] arr = new int[9];

        for(int i=0; i<9; i++) {
            String a = br.readLine();
            arr[i] = Integer.parseInt(a);
        }
        int[] arr1 = arr;
        Arrays.sort(arr);
        int[] arr2 = arr;

        System.out.println(arr1[arr1.length-1]);
        for(int i=0; i< arr1.length; i++) {
            if(arr1[i] == arr2[8]) {
                System.out.println(i);
            }
        }
*/
    }

}
/*
        9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

        예를 들어, 서로 다른 9개의 자연수

        3, 29, 38, 12, 57, 74, 40, 85, 61

        이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

        입력
        첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

        출력
        첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
*/
