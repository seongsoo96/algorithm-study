//https://programmers.co.kr/learn/courses/30/lessons/86491
//최소직사각형

import java.util.Arrays;

class MinimumRectangle {
    public int solution(int[][] sizes) {
        int answer = 0;

        for(int i=0; i<sizes.length; i++) {
            int temp = 0;
            if(sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
        }
        int[] big = new int[sizes.length];
        for(int i=0; i<sizes.length; i++) {
            big[i] = sizes[i][0];
        }


        int[] small = new int[sizes.length];
        for(int i=0; i<sizes.length; i++) {
            small[i] = sizes[i][1];
        }
        Arrays.sort(big);
        Arrays.sort(small);

        answer = big[sizes.length-1] * small[sizes.length-1];

        return answer;
    }
}