public class ArrayOfTiers {

  public static String[] createArrayOfTiers(int num) {
    String[] result = new String[String.valueOf(num).length()];
    
    for (int i = 0; i < String.valueOf(num).length(); i++) {
      result[i] = String.valueOf(num).substring(0, i + 1);
    }
    
    return result;
  } 
}
