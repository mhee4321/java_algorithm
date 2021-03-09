package programmers;

import java.util.Arrays;


public class lifeBoat {
    public static int solution(int[] people, int limit) {
        int answer = 0, min = 0;
        //오름차순
        Arrays.sort(people);

        for(int max = people.length-1; min<=max; max--){
            if(people[min] + people[max]<= limit) min++;
            answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        int[] p = {70, 50, 80, 50};
        int limit = 100;
        System.out.print(solution(p, limit));
    }
}
