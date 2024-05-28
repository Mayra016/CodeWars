public class Trigrams {

  /* EXAMPLE:
    "the quick red" --> "the he_ e_q _qu qui uic ick ck_ k_r _re red"
  */
	public static String trigrams( String phrase ) {
    StringBuilder result = new StringBuilder();
    
    if (phrase.length() < 3) {
      return "";
    }
    
    for (int i = 0; i < phrase.length() - 2; i++) {
      String three = phrase.substring(i, i + 3);
      result.append(three.replaceAll(" ", "_"));
      if (i < phrase.length() - 3) {
        result.append(' ');
      }
    }
    
    return result.toString();
	}
}
