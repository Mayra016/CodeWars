public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberString.length(); i++) {
          int num = Character.getNumericValue(numberString.charAt(i));
          
          if (num < 5) {
            result.append("0");
          }
          if (num >= 5) {
            result.append("1");
          }
        }
        return result.toString();
    }
}
