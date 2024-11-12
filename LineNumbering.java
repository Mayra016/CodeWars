import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        int linesNum = 1;
      
        for (int i = 0; i < lines.size(); i++) {
          lines.set(i, String.valueOf(linesNum) + ": " + lines.get(i));
          linesNum++;
        }
      
        return lines;
    }
}
