//https://programmers.co.kr/learn/courses/30/lessons/12903
//가운데 글자 가져오기

class GetMiddleCharacter {
    public String solution(String s) {
        String answer = "";
        System.out.println(s.length());
        if(s.length()%2==0) { //짝수일 때
            answer = String.valueOf(s.charAt(s.length()/2-1))
                    + String.valueOf(s.charAt(s.length()/2));
        } else {
            answer = String.valueOf(s.charAt(s.length()/2));
        }

        return answer;
    }
}