public class MakeAFunctionThatDoesArithmetic {
    
    public static int arithmetic(int a, int b, String operator) {
        int c = 0;
        switch(operator) {
            case "add":
                return c = a + b;
            case "subtract":
                return c = a - b;
            case "divide":
                return c = a / b;
            case "multiply":
                return c = a * b;
        }
        return c;
    }
}