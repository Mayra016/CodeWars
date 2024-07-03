public class PrintSquare {
    public static final String generateShape(int n) {
        String line = "";
        String square = "";
      
        for (int i = 0; i < n; i++) {
          line = line.concat("+");
        }
      
        for (int x = 0; x < n; x++) {
          square = square.concat(line + "\n");
        }
      
        return square.substring(0, square.length() - 1);
    }
}
