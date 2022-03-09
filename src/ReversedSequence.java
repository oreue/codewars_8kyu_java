public class ReversedSequence{
    
    public static int[] reverse(int n) {
        int[] res = new int[n];
        for (int i=0; i<n; i++) {
          res[i]=n-i;
        }
        return res;
    }
}