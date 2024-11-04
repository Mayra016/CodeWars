public class Accumul {
    
    public static String accum(String s) {
      StringBuilder result = new StringBuilder();
    
      for (int i = 0; i < s.length(); i++) {
        for ( int z = 0; z < i + 1; z++) {
          if (z == 0) {
            result.append(Character.toUpperCase(s.charAt(i)));
          } else {
            result.append(Character.toLowerCase(s.charAt(i)));
          }
          
        }
        
        if ( i != s.length() -1 ) {
          result.append("-");
        }
      }
      return result.toString();
    }
  
    
}
