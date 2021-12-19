//https://programmers.co.kr/learn/courses/30/lessons/12917
//문자열 내림차순으로 배치하기

import java.util.*;

class PlacingStringInDesc {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split("");

        Arrays.sort(str, Collections.reverseOrder());

        for(int i=0; i<str.length; i++) {
            sb.append(str[i]);
        }

        return sb.toString();
    }
}