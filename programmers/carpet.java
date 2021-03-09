package programmers;

public class carpet {
    public int[] solution(int brown, int yellow) {
        int a = (brown+4)/2;
        int b = brown+yellow;
        //sqrt = 제곱근
        int[] answer = {(int)(a+Math.sqrt(a*a-4*b))/2, (int)(a-Math.sqrt(a*a-4*b))/2};
        return answer;
    }
}
