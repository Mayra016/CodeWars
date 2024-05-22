public class ReverseWords {
  public static String reversePhrase(final String original) {
        String[] words = original.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
          for (int x = words[i].length() - 1; x >= 0; x--) {
            result.append(String.valueOf(words[i].charAt(x)));
          }
          if (i != words.length - 1) {
            result.append(" ");
          }
          
        }
        return original.replaceAll(" ", "") != "" ? result.toString() : original;
  }

  public static String reversePhrase2(final String original) {
        String[] array = original.split(" "); 
        
        if(array.length == 0) 
            return original;
              
        int i = 0;
        // iterate over each word and reverse the words with the method reverse of StringBuilder
        for(String string : array){
            array[i] = new StringBuilder(string).reverse().toString();
            i++;
        }
        
        return String.join(" ",array);
  }
}
