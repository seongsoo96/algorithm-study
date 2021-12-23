//https://programmers.co.kr/learn/courses/30/lessons/12922
//수박수박수박수박수박수?

class Watermelon {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            if(i%2==0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }
        return sb.toString();
    }
}