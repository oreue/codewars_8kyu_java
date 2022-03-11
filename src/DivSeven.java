public class DivSeven {
    
    public static long[] seven(long m) {
    int kroki = 0; 
        while (m >= 100) {
            m = (long)(Math.floor(m / 10) - 2 * (m % 10));
            kroki++;
        }
        return new long[] {m, kroki};
    }
}