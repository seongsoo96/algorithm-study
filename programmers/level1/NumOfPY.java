//https://programmers.co.kr/learn/courses/30/lessons/12916
//문자열 내 p와 y의 개수

class NumOfPY {
    boolean solution(String s) {
        boolean answer;
        int pCnt = 0;
        int yCnt = 0;

        String[] str = s.split("");
        for(int i=0; i<str.length; i++) {
            if(str[i].equals("p") || str[i].equals("P")) {
                pCnt++;
            } else if(str[i].equals("y") || str[i].equals("Y")) {
                yCnt++;
            }
        }

        if(pCnt == yCnt) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}