//https://programmers.co.kr/learn/courses/30/lessons/12918
//문자열 다루기 기본

class StringHandlingBasic {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6) {
            return false;
        }
        for(int i=0; i<s.length(); i++) {
            System.out.println((int)s.charAt(i));
            if((int)s.charAt(i) < 48 || (int)s.charAt(i) > 57) {
                answer = false;
            }
        }
        return answer;
    }
}