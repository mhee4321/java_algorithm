package programmers;

public class Country124 {
    public static String solution(int n) {
        String[] num = {"4", "1", "2"};
        String result = "";
        while(n > 0){
            result = num[n % 3] + result;
            n = (n - 1)/3;
        }

        return result;
    }

    public static void main(String[] args){
        int n = 1;
        String result = solution(n);
        System.out.print(result);
    }

}
