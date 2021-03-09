package programmers;

import java.util.ArrayList;

public class funcDevelop {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int[] day_list = new int[100];
        int day = 0;
        for(int i=0; i<speeds.length; i++){
            while(progresses[i] + (day*speeds[i]) < 100){
                day++;
            }
            day_list[day]++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : day_list){
            if(i!=0)
                list.add(i);
        }
        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args){
        int[] a = {93, 30, 55};
        int[] b = {1, 30, 5};
        int[] answer = solution(a, b);

        for(int i=0;i<answer.length;i++)
            System.out.print(answer[i] + " ");
    }
}
