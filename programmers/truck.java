package programmers;
import java.util.*;

class Solution {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int size = truck_weights.length, idx = 0;
        int current = 0;
        Queue<Integer> bridge = new LinkedList<>();

        do {
            if (bridge.size() == bridge_length)
                current -= bridge.poll();
            if (idx < size && current + truck_weights[idx] <= weight) {
                bridge.add(truck_weights[idx]);
                current += truck_weights[idx++];
            }
            else
                bridge.add(0);
            answer++;
        }while(current != 0);

        return answer;
    }
    public static void main(String[] args){
        int a = 2;
        int b = 10;
        int[] c = {7,4,5,6};
        int answer = solution(a, b, c);
        System.out.print(answer);
    }
}

