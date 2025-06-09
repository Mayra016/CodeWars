public class BasicMathCalculate {
    public static String calculate(String str) {
        if (str == null || str.isEmpty()) return "0";

        str = str.replace("plus", "+").replace("minus", "-");

        String[] tokens = str.split("(?=[+-])|(?<=[+-])");

        int result = Integer.parseInt(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int number = Integer.parseInt(tokens[i + 1]);

            if (operator.equals("+")) {
                result += number;
            } else if (operator.equals("-")) {
                result -= number;
            }
        }

        return String.valueOf(result);
    }
}
