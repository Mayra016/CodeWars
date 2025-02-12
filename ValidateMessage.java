public class ValidateMessage {
  
  public static boolean isAValidMessage(String message) {
    if (message.isEmpty()) return true;
    
    int i = 0;
    while (i < message.length()) {
      int length = 0;
      while (i < message.length() && Character.isDigit(message.charAt(i))) {
        length = length * 10 + (message.charAt(i) - '0'); 
        i++;
      }

      if (i >= message.length() && length > 0) {
        return false;
      }
      
      int start = 0;
      while (i < message.length() && Character.isLetter(message.charAt(i))) {
        start++;
        i++;
      }

      if (start != length) {
        
        return false;
      }  
    }

    return true;
  }
}
