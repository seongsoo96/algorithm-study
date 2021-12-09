//https://programmers.co.kr/learn/courses/30/lessons/12901
//2016년

class Year2016 {
    public String solution(int a, int b) {
        String answer = "";

        switch(a) {
            case 1: b += 0;
                break;
            case 2: b += 31;
                break;
            case 3: b += 60;
                break;
            case 4: b += 91;
                break;
            case 5: b += 121;
                break;
            case 6: b += 152;
                break;
            case 7: b += 182;
                break;
            case 8: b += 213;
                break;
            case 9: b += 244;
                break;
            case 10: b += 274;
                break;
            case 11: b += 305;
                break;
            case 12: b += 335;
                break;
        }

        switch(b%7) {
            case 1: answer = "FRI";
                break;
            case 2: answer = "SAT";
                break;
            case 3: answer = "SUN";
                break;
            case 4: answer = "MON";
                break;
            case 5: answer = "TUE";
                break;
            case 6: answer = "WED";
                break;
            case 0: answer = "THU";
                break;
        }

        return answer;
    }
}