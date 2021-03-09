package programmers;

import java.util.ArrayList;

//https://eu-ne.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%81%B0-%EC%88%98-%EB%A7%8C%EB%93%A4%EA%B8%B0-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98
public class makeBigNumber {
    public static String solution(String number, int k) {
        int idx = 0;
        char max;
        StringBuffer answer = new StringBuffer();

        //if(number.charAt(0) == '0') return "0";
        for(int i=0; i<number.length()-k; i++){
            max = '0';
            for(int j=idx; j<=k+i; j++){
                if(max < number.charAt(j)){
                    max = number.charAt(j);
                    idx = j+1;
                }
            }
            answer.append(max);
        }


        return answer.toString();
    }

    public static void main(String[] args){
        String n = "1924";
        int k = 2;
        System.out.print(solution(n, k));
    }
}
