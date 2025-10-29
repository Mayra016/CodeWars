class MultiTable {
    public static String multiTable(int num) {
        String result = "";
      
        for (int i = 1; i < 11; i++) {
          result += String.format("%d * %d = %d%n", i, num, i * num);
        }
      
        return result.trim();
    }
}
