package programmers;
import java.util.*;

public class phoneNumberList {
    static public boolean solution(String[] phoneBook) {
        Arrays.sort(phoneBook);
        //HashMap mp = new HashMap();

        for(int i=0; i<phoneBook.length-1;i++)
        {
            if(phoneBook[i+1].startsWith(phoneBook[i])) {return false;}
        }
        return true;
    }
    public static void main(String[] args){
        String[] p_list = {"12","123","1235","567","88"};

        System.out.println(solution(p_list));
    }
}
