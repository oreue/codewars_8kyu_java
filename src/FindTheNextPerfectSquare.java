public class FindTheNextPerfectSquare {
    
    public static long findNextSquare(long sq) {
        long root = (long) Math.sqrt(sq); 
        if (Math.pow(root, 2) != sq) {
            return -1;
        }
        return (long) Math.pow((root + 1), 2);
    }
}