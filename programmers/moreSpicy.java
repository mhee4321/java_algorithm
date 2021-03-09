package programmers;

import java.util.PriorityQueue;



public class moreSpicy {
    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i : scoville)
            q.add(i);

        int answer = 0;
        while(q.size() > 1 && q.peek() < K){
            int first = q.poll();
            int second = q.poll();

            int mix = first + (2 * second);
            q.add(mix);
            answer++;
        }
        if(q.size() <= 1 && q.peek() < K)
            answer = -1;

        return answer;
    }

    public static void main(String[] args){
        int[] s = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.print(solution(s, k));
    }
}
