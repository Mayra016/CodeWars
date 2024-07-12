public class SplitStrings {
    /* EXAMPLE:
      * 'abc' =>  ['ab', 'c_']
      * 'abcdef' => ['ab', 'cd', 'ef']
    */
    public static String[] solution(String s) {
        int lengthResult = s.length() % 2 == 0 ? s.length()/2 : s.length()/2 + 1;
        String[] result = new String[lengthResult];
        int index = 0;
      
        for (int i = 0; i < s.length(); i += 2) {
          if (i < s.length() - 1) {
            result[index] = s.substring(i, i+2);           
          } else {
            result[index] = String.valueOf(s.charAt(s.length() - 1)) + '_';
          }
          index++;
        }
      
        return result;
    }
}
