class DotsCalc {
  public static String calc(String txt){
    int first = 0;
    int second = 0;
    char operator = ' ';
    
    // identify numbers and operator
    for (int i = 0; i < txt.length(); i++) {
      if (txt.charAt(i) == '.' && operator == ' ') {
        first++;
      }
      
      if (txt.charAt(i) == ' ' && txt.charAt(i + 1) != '.') {
        operator = txt.charAt(i + 1);
      }
      
      if (txt.charAt(i) == '.' && operator != ' ') {
        second++;
      }
    }
    
    // return operation's result
    if (operator == '+') {
      return ".".repeat(first + second);
    }
    
    if (operator == '-') {
      return ".".repeat(first - second);
    }
    
    if (operator == '*') {
      return ".".repeat(first * second);
    }
    
    if (operator == '/') {
      return ".".repeat(first / second);
    }
    
    return "";
  }
}
