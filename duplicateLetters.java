public class DuplicateLetters{
  public static String doubleChar(String s){
    StringBuilder result = new StringBuilder();
    
    for(int i = 0; i < s.length(); i++) {
      for (int x = 0; x < 2; x++) {
        result.append(s.charAt(i));
      }
    }
    
    return result.toString();
  }
}
