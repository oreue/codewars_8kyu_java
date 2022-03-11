public class ReverseWords {
    
    public static String reverseWords(final String original) {
        String[] slowa = original.split(" ");

        if (slowa.length == 0) {
            return original;
        }

        int i = 0;
        for (String string : slowa) {
            slowa[i] = new StringBuilder(string).reverse().toString();
            i++;
        }

        return String.join(" ", slowa);
    }
}