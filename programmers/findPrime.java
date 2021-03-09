package programmers;

import java.util.ArrayList;
//완전탐색 => 너무어려워서 추후에 다시 하기
public class findPrime {
    public static int solution(String numbers) {
        int answer = 0;
        String[] num = numbers.split("");
        ArrayList<Integer> list = new ArrayList<>();
        for(String i : num)
            list.add(Integer.parseInt(i));
        for(int i=0; i<list.size(); i++){

        }
        return answer;
    }

    public static void main(String[] args){
        String a = "17";
        System.out.print(solution(a));
    }
}
