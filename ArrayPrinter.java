public class ArrayPrinter {

    public static String printArray(Object[] array) {
      StringBuilder result = new StringBuilder();
      
      for (Object element : array) {
        result.append(String.valueOf(element).concat(","));
      }
      
      return result.substring(0,result.length() - 1).toString();
    }
}
