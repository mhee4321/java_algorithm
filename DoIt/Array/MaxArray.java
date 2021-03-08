package DoIt.Array;

import java.util.Random;

public class MaxArray {
    static int maxOf(int[] a){
        int max = a[0];
        for(int i=1; i<a.length;i++)
            if(a[i] > max)
                max = a[i];
        return max;
    }
    public static void main(String[] args){
        Random ran = new Random();
        int[] b = new int[10];

        for(int i=0; i<10; i++){
            //90까지 난수발생
            b[i] = ran.nextInt(90);
        }
        System.out.println(maxOf(b));
    }
}
