//https://programmers.co.kr/learn/courses/30/lessons/67256

package level1;

class pressKeypad {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == 0) {
                numbers[i] = 11;
            }
            if(numbers[i]%3 == 1) {
                left = numbers[i];
                answer += "L";
            } else if(numbers[i]%3 == 0) {
                right = numbers[i];
                answer += "R";
            } else {
                int[] leftPos = getPosition(left);
                int[] rightPos = getPosition(right);
                int[] curPos = getPosition(numbers[i]);

                int leftDistance = getDistance(leftPos, curPos);
                int rightDistance = getDistance(rightPos, curPos);

                if(leftDistance < rightDistance) {
                    left = numbers[i];
                    answer += "L";
                } else if(leftDistance > rightDistance) {
                    right = numbers[i];
                    answer += "R";
                } else if(leftDistance == rightDistance) {
                    if(hand.equals("left")) {
                        left = numbers[i];
                        answer += "L";
                    } else {
                        right = numbers[i];
                        answer += "R";
                    }
                }
            }
        }

        return answer;
    }

    public int getDistance(int[] a, int[] b) {
        return (int)(Math.abs(a[0]-b[0]) + Math.abs(a[1]-b[1]));
    }

    public int[] getPosition(int num) {
        int x = (num+2)%3;
        int y = (num-1)/3;
        int[] position = {x, y};

        return position;
    }
}