public class PangramChecker {
  public boolean check(String sentence){
        String valid = "abcdefghijklmnopqrstuvxyz";
        int i = 0;
        
        while (i < sentence.length() && valid.length() > 1) {
          valid = valid.replaceAll(String.valueOf(sentence.charAt(i)), "");     
          i++;

          if (i == sentence.length() && valid != "") {
            return false;
          }
        }
        
        return true;
  }
}
