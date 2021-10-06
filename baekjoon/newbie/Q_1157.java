import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//단어 공부(1157)
public class Q_1157 {

    public static void main(String[] args) throws Exception  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] word = br.readLine().split("");

        int[] cnt = new int[26];
        int[] ascii = new int[26];
        int[] wordAscii = new int[word.length];

        for(int i=0; i<26; i++) {
            cnt[i] = 0;
            ascii[i] = i + 65;
        }

        for(int i=0; i<word.length; i++) {
            wordAscii[i] = word[i].charAt(0);
        }

        for(int i=0; i<word.length; i++) {
            for(int j=0; j<26; j++) {
                if(wordAscii[i] >= 97 || wordAscii[i] <= 122) {
                    if((wordAscii[i]-32) == ascii[j]) {
                        cnt[j]++;
                    }
                }
                if(wordAscii[i] >= 65 || wordAscii[i] <= 90) {
                    if((wordAscii[i]) == ascii[j]) {
                        cnt[j]++;
                    }
                }
            }
        }
        int[] clone = cnt.clone();

        int temp = 0;
        int idx = 0;

        Arrays.sort(cnt);

        if(cnt[25] == cnt[24]) {
            System.out.println("?");
        } else {
            for(int i=0; i<26; i++) {
                if(clone[i] > temp) {
                    temp = clone[i];
                    idx = i+65;
                }
            }
            System.out.println((char)idx);
        }
    }

}

/*
    알파벳 대소문자로 된 단어가 주어지면,
    이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
    단, 대문자와 소문자를 구분하지 않는다.

    입력
    첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
    baaa    zZa     Mississipi

    출력
    첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
    단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
    A       Z       ?
*/
