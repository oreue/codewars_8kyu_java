public class IfYouCantSleepJustCountSheep {
    
    public static String countingSheep(int num) {
        String sheep = " sheep...";
        String result = "";
        for (int i = 1; i < num; i++) {
            result += i + sheep;
        }
        return result;
    }
}
