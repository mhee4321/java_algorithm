package DoIt.Search;

public class binarySearch {
    static int binSearch(int[] a, int n, int key){ //배열, 총 수, 찾는 키
        int pl = 0;
        int pr = n-1;

        do{
            int pc = (pl + pr) /2;
            if(a[pc] == key)
                return pc;
            else if(a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;
        }while(pl <= pr);
        
        return -1;
    }
    
}
