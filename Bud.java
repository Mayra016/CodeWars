public class Bud {
   public static String computerToPhone(String number){
     String result = "";
     
     for (int i = 0; i < number.length(); i++) {
       int num = Character.getNumericValue(number.charAt(i));
       if ( num >= 7) {
         result += String.valueOf(num - 6);
       }
       if (num <= 3 && num > 0) {
         result += String.valueOf(num + 6);
       }
       if (num > 3 && num < 7) {
         result += String.valueOf(num);
       }
       if (num == 0) {
         result += "0";
       }
     }
                                  
     return result;
   }
}

