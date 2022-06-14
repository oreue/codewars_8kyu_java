import java.text.DecimalFormat;
import java.util.Random;

public class Test {

    public static void main(String[] args) {

        int max = 40;
        int min = 5;
        Random rand = new Random();
        DecimalFormat df = new DecimalFormat("0.00");
        Double range = (double) (max - min);
        String result = df.format((rand.nextDouble() * range) + min);

        System.out.println(result);
    }
}
