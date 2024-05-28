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

    public static String fakeBin2(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
