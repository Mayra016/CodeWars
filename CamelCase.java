class CamelCase {
  public static String camelCase(String input) {
    int start = 0;
    StringBuilder result = new StringBuilder();
    
    for (int i = 1; i < input.length(); i++) {
      if (Character.isUpperCase(input.charAt(i))) {
        result.append(input.substring(start, i)).append(" ");
        start = i;
      }
    }
    
    result.append(input.substring(start));
    
    return result.toString();
  }
}
