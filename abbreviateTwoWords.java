public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] names = name.split(" ");
    String result = "";
    for (int i = 0; i < names.length; i++) {
      result = result.concat(String.valueOf(names[i].charAt(0)).toUpperCase());
      if ( i != names.length - 1) { 
        result = result.concat(".");
      }
      
    }
    return result;
  }
}
