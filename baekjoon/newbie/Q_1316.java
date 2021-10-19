import java.io.BufferedReader;
import java.io.InputStreamReader;

//그룹 체커 단어(1316)
public class Q_1316 {

    public static void main(String[] args) throws Exception  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());//단어 개수 입력
        int ans = N;//ans에 단어 개수 대입

        for(int i=0; i<N; i++) {
            String word = br.readLine();//단어 입력
            boolean[] chk = new boolean[26];//chk 배열 선언. 등장한 문자는 true로 변경한다.

            for(int j=1; j<word.length(); j++) {//단어의 길이만큼 반복
                if(word.charAt(j-1) != word.charAt(j)) {//현재 문자와 이전 문자가 같이 않다면
                    if(chk[word.charAt(j)-97] == true) {//현재 문자가 이전에 나온 적이 있다면
                        ans--;              //그룹단어가 아니므로 ans-1
                        break;              //더 이상 확인할 필요가 없으므로 break;
                    }
                    chk[word.charAt(j-1) - 97] = true;//chk 배열의 현재 단어 위치를 true로 변경

                }

            }
        }
        System.out.println(ans);
    }
}

/*
    그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
    예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
    aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
    단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다.
    둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
    3       //4         //5
    happy   //aba       //ab
    new     //abab      //aa
    year    //abcabc    //aca
            //a         //ba
                        //bb
    출력
    첫째 줄에 그룹 단어의 개수를 출력한다.
    3       //1         //4
*/
