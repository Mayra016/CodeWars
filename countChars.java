import java.util.Arrays;

interface CountChars {
	static int countCharOccurrences(String s, char c) {
    char[] word = s.toCharArray();
    Arrays.sort(word);
    int count = 0;
    
    for (int i = 0; i < word.length; i++) {
      if (word[i] == c) {
        count++;    
        if (i != word.length - 1 && word[i + 1] != c) {
          break;
        }
      }
    }
    
    return count;
  }
}
