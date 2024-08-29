import java.util.HashMap;

public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
      HashMap<Integer, String> options = new HashMap<>();
      options.put(1, "I love you");
      options.put(2, "a little");
      options.put(3, "a lot");
      options.put(4, "passionately");
      options.put(5, "madly");
      options.put(6, "not at all");
      
      int remainder = nb_petals % 6;
      if (remainder == 0) {
        remainder = 6;
      }

      return options.get(remainder);

    }
}
