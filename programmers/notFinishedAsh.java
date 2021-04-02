package programmers;

import java.util.Arrays;

public class notFinishedAsh {
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){
            //문자열 내용 비교는 equals, 주소값 비교는 ==
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];

    }

    public static void main(String[] args){
        String[] a = {"mislav", "stanko", "mislav", "ana"};
        String[] b = {"stanko", "ana", "mislav"};
        String answer = solution(a, b);

        System.out.print(answer);
    }

}
