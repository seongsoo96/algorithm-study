//https://programmers.co.kr/learn/courses/30/lessons/12930
//이상한 문자 만들기

class CreateWeirdCharacters {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            sb.append(cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase());
        }

        return sb.toString();
    }
}