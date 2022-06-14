import java.util.ArrayList;
import java.util.List;

public class Testing123 {

        public static List<String> number(List<String> lines) {
            ArrayList<String> result = new ArrayList();
            int i = 0;
            for (String s : lines) {
                result.add(++i, ":" + s);
            }
            return result;
        }
}
