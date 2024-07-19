import java.util.Arrays;

public class GiftSorter{
  public String sortGiftCode(String code){
    char[] letters = code.toCharArray();
    
    Arrays.sort(letters);
    
    return String.valueOf(letters);
  }
}
