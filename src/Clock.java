public class Clock {
    
    public static int Past(int h, int m, int s) {
        int hours = h * 3600000;
        int minutes = m * 60000;
        int seconds = s * 1000;

        return hours + minutes + seconds;
    }
}
