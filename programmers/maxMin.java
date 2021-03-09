package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class maxMin {
    public static String solution(String s) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<>();
        String[] str=s.split(" ");

        for(String i : str)
            list.add(Integer.parseInt(i));

        answer = Collections.min(list) + " " + Collections.max(list);
        return answer;
    }
    public static void main(String[] args){

    }
}

