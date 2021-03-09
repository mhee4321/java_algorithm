package programmers;

import java.util.Arrays;

public class notFinishedAsh {
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){

            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];

    }

    public static void main(String[] args){
        String[] a = {"leo", "kiki", "eden"};
        String[] b = {"eden", "kiki"};
        String answer = solution(a, b);

        System.out.print(answer);
    }

}
