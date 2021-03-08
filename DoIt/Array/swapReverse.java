package DoIt.Array;

public class swapReverse {
    static void swap(int a[], int idx1, int idx2){
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }
    static void reverse(int[] a){
        for(int i=0; i<a.length/2; i++){
            swap(a, i, a.length -i -1);
        }
    }
    public static void main(String[] args){
        int[] b = {1, 2, 3, 4, 5};
        reverse(b);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
