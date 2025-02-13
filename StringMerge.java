public class StringMerge {
  public static String stringMerge(String s1, String s2, char letter) {
    int lenght = Math.max(s1.length(), s2.length());
    boolean letter1 = false;
    boolean letter2 = false;
    
    for (int i = 0; i < lenght; i++) {
      if (i < s1.length() && s1.charAt(i) == letter && letter1 == false) {
        s1 = s1.substring(0, i + 1);
        letter1 = true;
      }
      
      if (i < s2.length() && s2.charAt(i) == letter && letter2 == false) {
        s2 = s2.substring(i + 1);
        letter2 = true;
      }
      
      if (letter1 == true && letter2 == true) {
        break;
      }
    }
    
    return s1 + s2;
  }
}
