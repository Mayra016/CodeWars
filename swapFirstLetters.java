public class SwapFirstLetters {
    public String spoonerize(String words) {
      String[] sentence = words.split(" ");
      char first = sentence[0].charAt(0);
      char second = sentence[1].charAt(0);
      
      sentence[0] = second + sentence[0].substring(1, sentence[0].length());
      sentence[1] = first + sentence[1].substring(1, sentence[1].length());
      
      return sentence[0] + " " + sentence[1];
    }
}
