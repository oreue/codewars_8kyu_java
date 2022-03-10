import javax.swing.border.EmptyBorder;

public class SetAlarm {
    
    public static boolean setAlarm(boolean employed, boolean vacation) {
        return (employed == true && vacation == false) ? true : false;
    }
}
