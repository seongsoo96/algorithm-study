//https://programmers.co.kr/learn/courses/30/lessons/12915
//문자열 내 마음대로 정렬하기

import java.util.Arrays;

class SortingString {
    public String[] solution(String[] strings, int n) {

        for(int i=0; i<strings.length; i++) {
            strings[i] = strings[i].substring(n, n+1) + strings[i];
        }

        Arrays.sort(strings);

        for(int i=0; i<strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }

        return strings;
    }
}