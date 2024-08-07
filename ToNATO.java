public class ToNATO {
    public static String toNATO (String string) {
// You can use Helper.NATO, of type: Map<Character, String>
// usage: Helper.NATO.get('A') returns "Alfa", etc.
      StringBuilder result = new StringBuilder();
      
      for (String word : string.split(" ")) {
        for (char letter : word.toUpperCase().toCharArray()) {
          if (!Character.isLetter(letter)) {
            result.append(word.charAt(word.length() - 1));
          } else {
            letter = letter;
            result.append(Helper.NATO.get(letter));
          }
          result.append(" ");
        }
      }
        
        return result.toString().trim();
    }
}
