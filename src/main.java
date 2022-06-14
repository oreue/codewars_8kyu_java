public class main {

    public static void main(String[] args) {

        String kwotaTemp = "173 123 123,00".replaceAll("\\s", "");
        System.out.println(kwotaTemp);
        Double kwota = Double.parseDouble(kwotaTemp);
        System.out.println(kwota);
    }
}
