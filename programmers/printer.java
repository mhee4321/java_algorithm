package programmers;

import java.util.*;

public class printer {
    public static int solution(int[] priorities, int location) {
        int answer = 1;
        //int형 priorityQueue 선언 (우선순위가 높은 숫자 순)
        PriorityQueue p = new PriorityQueue<>(Collections.reverseOrder());;

        for(int i : priorities){
            p.add(i);
        }

        while(!p.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(priorities[i] == (int)p.peek()){
                    if(i == location){
                        return answer;
                    }
                    p.poll();
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        int[] a = {1, 1, 9, 1, 1, 1};
        int b = 0;
        int answer = solution(a, b);

        System.out.print(answer);
    }
}
