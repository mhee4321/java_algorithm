package programmers;

import java.util.Arrays;

public class scale {
    //https://velog.io/@ajufresh/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%A0%80%EC%9A%B8-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-Java
    public static int solution(int[] weight) {
        Arrays.sort(weight);
        int sum = weight[0];

        for(int i=1; i<weight.length; i++){
            sum += weight[i];

            if(i != weight.length - 1 && sum < weight[i+1]) break;
        }
        return sum + 1;
    }
    public static void main(String[] args){
        int[] a = {3, 1, 6, 2, 7, 30, 1};
        System.out.print(solution(a));
    }
}
