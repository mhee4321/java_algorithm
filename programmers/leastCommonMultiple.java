package programmers;

public class leastCommonMultiple {

//        int answer = 1;
//        int[] list = new int[arr.length];
//
//        for(int i=0; i<arr.length; i++){
//            do {
//                if (list[i] % 2 == 0)
//                    list[i] = list[i] / 2;
//                else if (list[i] % 3 == 0)
//                    list[i] = list[i] / 3;
//                else
//                    list[i] = list[i];
//            }while(list[i] % 2 ==0 || list[i] % 3 ==0);
//        }
//        for(int i=0; i<arr.length; i++){
//            answer *= list[i];
//        }
//        return answer;
    public static int gcd(int a, int b){//최대공약수
            while(b != 0){
                int r = a%b;
                a = b;
                b = r;
            }
            return a;
    }

    public static int lcm(int a, int b){//최소공배수
            return (a*b)/gcd(a,b);
    }

     public static int solution(int[] arr) {
            int a = lcm(arr[0], arr[1]);
            int answer = 0;
            for(int i=2; i<arr.length; i++){
                answer = lcm(a, arr[i]);
                a = answer;
                }
            return answer;
    }




    public static void main(String[] args){
        int[] a = {2,6,8,14};
        System.out.print(solution(a));
    }

}
