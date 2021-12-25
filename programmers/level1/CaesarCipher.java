//https://programmers.co.kr/learn/courses/30/lessons/12926
//시저 암호

class CaesarCipher {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split("");
        for(int i=0; i<arr.length; i++) {
            int ascii = getAscii(arr[i].charAt(0)) + n;
            if(ascii-n > 64 && ascii-n < 91) { //대문자일때
                if(ascii >= 91) {
                    ascii = ascii-26;
                }
            }
            if(ascii > 122) {
                ascii = ascii - 26;
            }
            if(ascii-n == 32) {
                ascii = 32;
            }
            answer.append((char)ascii);
        }
        return answer.toString();
    }

    public int getAscii(char a) {
        return (int) a;
    }
}